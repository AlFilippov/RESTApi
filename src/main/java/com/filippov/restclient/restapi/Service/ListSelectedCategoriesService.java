package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.dto.SelectedProfessionalCategories.ListSelectedCategoriesDTO;

import java.util.List;

public interface ListSelectedCategoriesService {
    ListSelectedCategoriesDTO getCategories(Integer id);
    List<ListSelectedCategoriesDTO>getAllCategories();
}
