package com.filippov.restclient.restapi.mapper;

import com.filippov.restclient.restapi.domain.Message;
import com.filippov.restclient.restapi.dto.ListMessagesDto;
import com.filippov.restclient.restapi.dto.MessageDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MessageMapper {
    MessageMapper MESSAGE_MAPPER = Mappers.getMapper(MessageMapper.class);
    MessageDto toMessageDto(Message message);
 List<MessageDto> toMessageDtos(List<Message>messageList);

}
