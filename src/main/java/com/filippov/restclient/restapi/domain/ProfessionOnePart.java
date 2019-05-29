package com.filippov.restclient.restapi.domain;

import lombok.Data;

import javax.persistence.*;



@Entity
@Table(name="ProfessionOnePart")
@Data
public class ProfessionOnePart {
    @Id
    private int indexDefenition;
    private Integer idDefinition;
    private String profession;
}
