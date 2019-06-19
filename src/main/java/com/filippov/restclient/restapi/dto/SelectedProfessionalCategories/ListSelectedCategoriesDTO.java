package com.filippov.restclient.restapi.dto.SelectedProfessionalCategories;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Data
public class ListSelectedCategoriesDTO {
    private Integer id ;
    private List<SelectedCategoriesDTO>selectedCategoriesDTO;
}
