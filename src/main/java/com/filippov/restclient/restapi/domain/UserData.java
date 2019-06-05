package com.filippov.restclient.restapi.domain;

import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Table
public class UserData {
    @Id
    private String login;
    private String password;
    @OneToMany(fetch= FetchType.LAZY,mappedBy = "userdata")
    private List<DataAboutProfessionUsers> dataAboutProfessionUsers;
    @OneToMany(fetch= FetchType.LAZY,mappedBy = "userdata")
    private List<DataAboutCoursesUsers> dataAboutCoursesUsers;
}
