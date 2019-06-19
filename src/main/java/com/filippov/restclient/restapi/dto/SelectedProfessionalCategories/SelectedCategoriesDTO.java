package com.filippov.restclient.restapi.dto.SelectedProfessionalCategories;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Data
public class SelectedCategoriesDTO {
    private Integer id ;
    private List<SelectGroupDTO> artisticCategories;
    private List<SelectGroupDTO> entrepreneurialCategories;
    private List<SelectGroupDTO> intellectualCategories;
    private List<SelectGroupDTO> officeCategories;
    private List<SelectGroupDTO> realistCategories;
    private List<SelectGroupDTO> socialCategories;
}
