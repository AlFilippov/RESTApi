package com.filippov.restclient.restapi.domain;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table
@Entity
@Getter
@Setter
public class ProfessionDataList {
    @Id
    private Long id;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "professionOnePartId")
    private List<ProfessionOnePart> professionOnePart=new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "professionTwoPartId")
    private List<ProfessionTwoPart> professionTwoPart=new ArrayList<>();

}
