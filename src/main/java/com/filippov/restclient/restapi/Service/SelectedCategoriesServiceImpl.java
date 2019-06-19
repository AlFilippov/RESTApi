package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.domain.SelectedProfessionalCategories.SelectedCategories;
import com.filippov.restclient.restapi.dto.SelectedProfessionalCategories.SelectedCategoriesDTO;
import com.filippov.restclient.restapi.mapper.ProfessionMapper;
import com.filippov.restclient.restapi.repository.SelectedCategoriesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("selectedcategoriesservice")
public class SelectedCategoriesServiceImpl implements SelectedCategoriesService {
    private final SelectedCategoriesRepository selectedCategoriesRepository;

    public SelectedCategoriesServiceImpl(SelectedCategoriesRepository selectedCategoriesRepository) {
        this.selectedCategoriesRepository = selectedCategoriesRepository;
    }

    @Override
    public List<SelectedCategoriesDTO> getCategoriesList() {
        List<SelectedCategories> selectedCategories = new ArrayList<>(selectedCategoriesRepository.findAll());
        return new ArrayList<>(ProfessionMapper.PROFESSION_MAPPER.toSelectedCategoriesDTOList(selectedCategories));
    }

    @Override
    public SelectedCategoriesDTO getCategoriesId(Integer id) {
        if (selectedCategoriesRepository.findById(id).isPresent()) {
            SelectedCategories selectedCategories = selectedCategoriesRepository.findById(id).get();
            SelectedCategoriesDTO selectedCategoriesDTO = ProfessionMapper.PROFESSION_MAPPER.
                    toSelectCategoriesDTo(selectedCategories);
            return selectedCategoriesDTO;
        } else {
            return null;
        }
    }
}
