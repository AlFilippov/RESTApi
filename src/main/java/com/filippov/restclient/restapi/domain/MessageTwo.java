package com.filippov.restclient.restapi.domain;

import lombok.Data;

import javax.persistence.*;

@Embeddable
@Table(name="messagetwo")
@Data
public class MessageTwo {
    @Id
    private int indexDefenition;
    private Integer idDefinition;
    private String profession;
}

