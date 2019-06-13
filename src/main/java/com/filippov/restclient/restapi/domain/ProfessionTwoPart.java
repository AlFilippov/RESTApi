package com.filippov.restclient.restapi.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="ProfessionTwoPart")
@Data
public class ProfessionTwoPart {
    @Id
    private int indexDefenition;
    private Integer idDefinition;
    private String profession;

}

