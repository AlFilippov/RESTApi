package com.filippov.restclient.restapi.facade;

import com.filippov.restclient.restapi.Service.MessageService;
import com.filippov.restclient.restapi.domain.Message;
import com.filippov.restclient.restapi.dto.MessageDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MessageFacade {
    @Autowired
    private MessageService messageService;
    @Autowired
    private ModelMapper modelMapper;

    public MessageDto getAll() {
        return convertToOrderDto( messageService.getAll());
    }

    private MessageDto convertToOrderDto(List<Message> message) {

        return modelMapper.map(message, MessageDto.class);
    }
}
