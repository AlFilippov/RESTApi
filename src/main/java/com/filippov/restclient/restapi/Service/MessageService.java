package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.domain.Message;
import com.filippov.restclient.restapi.repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("messageService")
public class MessageService {

    private final MessageRepo messageRepo;

    public MessageService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    public List<Message> getAll(){
        return  messageRepo.findAll();
    }
}
