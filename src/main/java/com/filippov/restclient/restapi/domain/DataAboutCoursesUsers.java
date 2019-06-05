package com.filippov.restclient.restapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
public class DataAboutCoursesUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_course ;
    private String direction_course;
    private String name_course;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_data_id")
    private UserData userData;
}
