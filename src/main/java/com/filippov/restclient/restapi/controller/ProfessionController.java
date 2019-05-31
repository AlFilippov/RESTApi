package com.filippov.restclient.restapi.controller;

import com.filippov.restclient.restapi.Service.ProfessionServiceImpl;
import com.filippov.restclient.restapi.domain.ProfessionDataList;
import com.filippov.restclient.restapi.dto.ListProfessionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("profession")
@RestController
public class ProfessionController {

    @Autowired
    private ProfessionServiceImpl professionService;
    @GetMapping
    public ResponseEntity<List<ListProfessionDto>> getAllPeople() {
        return ResponseEntity.ok(professionService.getList());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ListProfessionDto>findById(@PathVariable("id") Long id ){
        return ResponseEntity.ok(professionService.getId(id));
    }
}


//    private Map<String, String> getMessage(@PathVariable String id) {
//        return messages.stream().filter(messages -> messages.get("id").
//                equals(id)).
//                findFirst().
//                orElseThrow(NotFoundException::new);
//    }
//
//    //Добавляем данные
//    @PostMapping
//    public Map<String, String> create(@RequestBody Map<String, String> message) {
//        message.put("id", String.valueOf(counter++));
//        messages.add(message);
//        return message;
//    }
//
//    //Обновляем данные
//    @PutMapping("{id}")
//    public Map<String, String> update(@PathVariable String id, @RequestBody Map<String, String> message) {
//        Map<String, String> messageFromDb = getMessage(id);
//        messageFromDb.putAll(message);
//        messageFromDb.put("id", id);
//        return messageFromDb;
//    }
//
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable String id) {
//        Map<String, String> message = getMessage(id);
//        message.remove(message);
//    }


