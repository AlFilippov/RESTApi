package com.filippov.restclient.restapi.domain.SelectedProfessionalCategories.ProfessionalCategories;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SocialCategory")
@Data
public class SocialCategory {
    @Id
    private Integer id;
    private String request_name;
}
