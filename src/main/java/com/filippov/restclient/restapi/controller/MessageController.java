package com.filippov.restclient.restapi.controller;

import com.filippov.restclient.restapi.domain.Message;
import com.filippov.restclient.restapi.exceptions.NotFoundException;
import com.filippov.restclient.restapi.repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("message")
public class MessageController {
    private final MessageRepo messageRepo;

    @Autowired
    public MessageController(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }


    //По урлу message получаем все объекты
    @GetMapping
    public List<Message> list() {
        return messageRepo.findAll();
    }

    //По урлу message/"id" получаем объект
    @GetMapping("{id}")
    public Map<String, String> getOne(@PathVariable String id) {
        return getMessage(id);
    }

    private Map<String, String> getMessage(@PathVariable String id) {
        return messages.stream().filter(messages -> messages.get("id").
                equals(id)).
                findFirst().
                orElseThrow(NotFoundException::new);
    }

    //Добавляем данные
    @PostMapping
    public Map<String, String> create(@RequestBody Map<String, String> message) {
        message.put("id", String.valueOf(counter++));
        messages.add(message);
        return message;
    }

    //Обновляем данные
    @PutMapping("{id}")
    public Map<String, String> update(@PathVariable String id, @RequestBody Map<String, String> message) {
        Map<String, String> messageFromDb = getMessage(id);
        messageFromDb.putAll(message);
        messageFromDb.put("id", id);
        return messageFromDb;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        Map<String, String> message = getMessage(id);
        message.remove(message);
    }
}
