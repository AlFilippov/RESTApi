package com.filippov.restclient.restapi.repository;

import com.filippov.restclient.restapi.domain.SelectedProfessionalCategories.ListSelectedCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListSelectedCategoriesRepository extends JpaRepository<ListSelectedCategories,Integer> {

}
