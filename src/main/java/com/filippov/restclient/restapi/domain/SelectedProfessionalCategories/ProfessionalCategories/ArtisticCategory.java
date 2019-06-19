package com.filippov.restclient.restapi.domain.SelectedProfessionalCategories.ProfessionalCategories;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ArtisticCategory")
@Entity
@Data
public class ArtisticCategory {
    @Id
    private Integer id;
    private String request_name;
}
