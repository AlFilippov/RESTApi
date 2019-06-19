package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.dto.SelectedProfessionalCategories.SelectedCategoriesDTO;

import java.util.List;

public interface SelectedCategoriesService {
    List<SelectedCategoriesDTO> getCategoriesList();
    SelectedCategoriesDTO getCategoriesId(Integer id);
}
