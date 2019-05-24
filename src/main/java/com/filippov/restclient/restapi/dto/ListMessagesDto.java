package com.filippov.restclient.restapi.dto;

import lombok.Data;

import java.util.List;
@Data
public class ListMessagesDto  {
    private List<MessageDto> messageDtos;
}
