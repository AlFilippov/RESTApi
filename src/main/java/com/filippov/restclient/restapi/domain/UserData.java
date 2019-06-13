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

    public void setId(String id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setUser_pic(String user_pic) {
        this.user_pic = user_pic;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
