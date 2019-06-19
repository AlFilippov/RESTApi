package com.filippov.restclient.restapi.domain.SelectedProfessionalCategories.ProfessionalCategories;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "RealistCategory")
public class RealistCategory {
    @Id
    private Integer id;
    private String request_name;
}
