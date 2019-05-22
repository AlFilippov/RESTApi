package com.filippov.restclient.restapi.domain;

import lombok.Data;

import javax.persistence.*;



@Entity
@Table(name="message")
@Data
public class Message {
    @Id
    private int indexDefenition;
    private Integer idDefinition;
    private String profession;

}
