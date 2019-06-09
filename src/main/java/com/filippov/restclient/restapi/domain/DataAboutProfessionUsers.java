package com.filippov.restclient.restapi.domain;

import lombok.Data;

import javax.persistence.*;
@Entity
@Table
@Data
public class DataAboutProfessionUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String realist;
    private String intelectual;
    private String social;
    private String office;
    private String entrepreneurial;
    private String artistic;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userdata")
    private UserData userData;

}
