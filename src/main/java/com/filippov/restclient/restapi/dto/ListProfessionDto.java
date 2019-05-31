package com.filippov.restclient.restapi.dto;

import lombok.Data;

@Data
public class ListProfessionDto {
    private Long  id ;
    private ProfessionDto professionOnePart;
    private ProfessionDto professionTwoPart;

}
