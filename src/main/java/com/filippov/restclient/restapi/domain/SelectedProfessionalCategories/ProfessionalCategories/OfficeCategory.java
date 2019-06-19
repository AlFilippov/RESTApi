package com.filippov.restclient.restapi.domain.SelectedProfessionalCategories.ProfessionalCategories;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OfficeCategory")
@Data
public class OfficeCategory {
    @Id
    private Integer id;
    private String request_name;
}
