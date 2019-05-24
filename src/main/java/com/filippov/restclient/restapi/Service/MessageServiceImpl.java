package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.domain.Message;
import com.filippov.restclient.restapi.dto.ListMessagesDto;
import com.filippov.restclient.restapi.dto.MessageDto;
import com.filippov.restclient.restapi.mapper.MessageMapper;
import com.filippov.restclient.restapi.repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("messageservice")
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageRepo messageRepo;
    @Override
    public List<MessageDto> getAllMessage() {
        List<Message> messageList = new ArrayList<>(messageRepo.findAll());
     List<MessageDto> messageDtos = new ArrayList<>(MessageMapper.MESSAGE_MAPPER.toMessageDtos(messageList));
        return messageDtos;
    }


}
