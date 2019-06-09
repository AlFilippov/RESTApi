package com.filippov.restclient.restapi.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@Table
public class UserData {
    @Id
    private String id;
    private String login;
    private String user_pic;
    private String email;
    private String gender;

    private String password;
    @OneToMany(fetch= FetchType.LAZY,mappedBy = "userData")
    private List<DataAboutProfessionUsers> dataAboutProfessionUsers;
    @OneToMany(fetch= FetchType.LAZY,mappedBy = "userData")
    private List<DataAboutCoursesUsers> dataAboutCoursesUsers;
}
