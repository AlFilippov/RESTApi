package com.filippov.restclient.restapi.controller;

import com.filippov.restclient.restapi.dto.MessageDto;
import com.filippov.restclient.restapi.facade.MessageFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("message")
@RestController
public class MessageController {

private final MessageFacade messageFacade;

    public MessageController(MessageFacade messageFacade) {
        this.messageFacade = messageFacade;
    }

    @GetMapping
    public ResponseEntity<MessageDto> getData(){
    MessageDto messageDto =messageFacade.getAll();
    return new ResponseEntity<>(messageDto, HttpStatus.OK);
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


