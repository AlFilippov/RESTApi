package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.dto.ListMessagesDto;
import com.filippov.restclient.restapi.dto.MessageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("messageService")
public interface MessageService {
    List<MessageDto> getAllMessage();

}
