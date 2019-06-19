package com.filippov.restclient.restapi.domain.SelectedProfessionalCategories.ProfessionalCategories;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EntrepreneurialCategory")
@Data
public class EntrepreneurialCategory {
    @Id
    private Integer id;
    private String request_name;
}
