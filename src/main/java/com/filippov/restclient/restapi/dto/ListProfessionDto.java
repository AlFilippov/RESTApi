package com.filippov.restclient.restapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class ListProfessionDto {
    private Long  id ;
    private List<ProfessionDtoOnePart> professionOnePart;
    private List<ProfessionDtoTwoPart> professionTwoPart;


}
