package com.filippov.restclient.restapi.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="messagetwo")
@Data
public class MessageTwo {
    @Id
    private int indexDefenition;
    private Integer idDefinition;
    private String profession;
}

