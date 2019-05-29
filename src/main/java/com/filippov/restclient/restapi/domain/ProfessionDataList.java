package com.filippov.restclient.restapi.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Table
@Entity
@Data
public class ProfessionDataList {
    @Id
    private Long id ;
    @ManyToOne
    private ProfessionOnePart professionOnePart;
    @ManyToOne
    private ProfessionTwoPart professionTwoPart;
}
