package com.filippov.restclient.restapi.dto;

import lombok.Data;

import java.util.List;
@Data
public class GeneralInitDataDTO {
    private Integer id;
    private String application_name;
    private List<ListProfessionDto>professionDataLists;
}
