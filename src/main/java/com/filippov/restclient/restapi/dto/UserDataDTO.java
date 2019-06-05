package com.filippov.restclient.restapi.dto;

import com.filippov.restclient.restapi.domain.DataAboutCoursesUsers;
import com.filippov.restclient.restapi.domain.DataAboutProfessionUsers;
import lombok.Data;

import java.util.List;

@Data
public class UserDataDTO {
    private String login;
    private String password;
    private List<DataAboutProfessionUsers> dataAboutProfessionUsers;
    private List<DataAboutCoursesUsers> dataAboutCoursesUsers;
}
