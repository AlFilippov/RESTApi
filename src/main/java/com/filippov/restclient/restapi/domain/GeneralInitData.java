package com.filippov.restclient.restapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class GeneralInitData {
    @Id
    private Integer id;
    private String application_name;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "professionDataId")
    private List<ProfessionDataList> professionDataLists=new ArrayList<>();

}
