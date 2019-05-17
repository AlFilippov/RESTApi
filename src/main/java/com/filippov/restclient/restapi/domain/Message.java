package com.filippov.restclient.restapi.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Message {
    private int idDefinition;
    private Integer indexDefenition;
    private String profession;



}
