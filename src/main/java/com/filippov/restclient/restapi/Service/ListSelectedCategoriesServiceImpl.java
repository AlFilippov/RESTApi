package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.domain.SelectedProfessionalCategories.ListSelectedCategories;
import com.filippov.restclient.restapi.dto.SelectedProfessionalCategories.ListSelectedCategoriesDTO;
import com.filippov.restclient.restapi.mapper.ProfessionMapper;
import com.filippov.restclient.restapi.repository.ListSelectedCategoriesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("listselectedcategoriesservice")
public class ListSelectedCategoriesServiceImpl implements ListSelectedCategoriesService {
    private final ListSelectedCategoriesRepository listSelectedCategoriesRepository;

    public ListSelectedCategoriesServiceImpl(ListSelectedCategoriesRepository listSelectedCategoriesRepository) {
        this.listSelectedCategoriesRepository = listSelectedCategoriesRepository;
    }

    @Override
    public ListSelectedCategoriesDTO getCategories(Integer id) {
        if (listSelectedCategoriesRepository.findById(id).isPresent()) {
            ListSelectedCategories listSelectedCategories = listSelectedCategoriesRepository.findById(id).get();
            ListSelectedCategoriesDTO listSelectedCategoriesDTO = ProfessionMapper.
                    PROFESSION_MAPPER.toListSelectCategoriesDTO(listSelectedCategories);
            return listSelectedCategoriesDTO;
        } else {
            return null;
        }
    }

    @Override
    public List<ListSelectedCategoriesDTO> getAllCategories() {
        List<ListSelectedCategories> listSelectedCategories = new ArrayList<>(listSelectedCategoriesRepository.findAll());
        List<ListSelectedCategoriesDTO> listSelectedCategoriesDTOS = new ArrayList<>(ProfessionMapper.PROFESSION_MAPPER.toListCategoriesDTO(listSelectedCategories));
        return listSelectedCategoriesDTOS;
    }
}
