package com.filippov.restclient.restapi.controller;

import com.filippov.restclient.restapi.Service.ListSelectedCategoriesServiceImpl;
import com.filippov.restclient.restapi.Service.SelectedCategoriesServiceImpl;
import com.filippov.restclient.restapi.dto.SelectedProfessionalCategories.ListSelectedCategoriesDTO;
import com.filippov.restclient.restapi.dto.SelectedProfessionalCategories.SelectedCategoriesDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("data/category")
@RestController
public class SelectedCategoriesController {
    private final SelectedCategoriesServiceImpl selectedCategoriesService;
    private final ListSelectedCategoriesServiceImpl listSelectedCategoriesService;

    public SelectedCategoriesController(SelectedCategoriesServiceImpl selectedCategoriesService, ListSelectedCategoriesServiceImpl listSelectedCategoriesService) {
        this.selectedCategoriesService = selectedCategoriesService;
        this.listSelectedCategoriesService = listSelectedCategoriesService;
    }

    @GetMapping
    public ResponseEntity<ListSelectedCategoriesDTO> getAllCategories(@RequestParam(value = "id") Integer id) {
        return ResponseEntity.ok(listSelectedCategoriesService.getCategories(id));
    }

    @GetMapping("/group")
    public ResponseEntity<SelectedCategoriesDTO> getIdCategory(@RequestParam(value = "id") Integer id) {
        return ResponseEntity.ok(selectedCategoriesService.getCategoriesId(id));

    }
}
