package com.filippov.restclient.restapi.repository;

import com.filippov.restclient.restapi.domain.SelectedProfessionalCategories.SelectedCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelectedCategoriesRepository extends JpaRepository<SelectedCategories,Integer> {
}
