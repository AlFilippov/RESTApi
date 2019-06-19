package com.filippov.restclient.restapi.mapper;

import com.filippov.restclient.restapi.domain.GeneralInitData;
import com.filippov.restclient.restapi.domain.ProfessionDataList;
import com.filippov.restclient.restapi.domain.ProfessionOnePart;
import com.filippov.restclient.restapi.domain.SelectedProfessionalCategories.ListSelectedCategories;
import com.filippov.restclient.restapi.domain.SelectedProfessionalCategories.SelectedCategories;
import com.filippov.restclient.restapi.domain.UserData;
import com.filippov.restclient.restapi.dto.GeneralInitDataDTO;
import com.filippov.restclient.restapi.dto.ListProfessionDto;
import com.filippov.restclient.restapi.dto.ProfessionDtoOnePart;
import com.filippov.restclient.restapi.dto.SelectedProfessionalCategories.ListSelectedCategoriesDTO;
import com.filippov.restclient.restapi.dto.SelectedProfessionalCategories.SelectedCategoriesDTO;
import com.filippov.restclient.restapi.dto.UserDataDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProfessionMapper {
    ProfessionMapper PROFESSION_MAPPER = Mappers.getMapper(ProfessionMapper.class);

    List<ListProfessionDto> toListMessageDto(List<ProfessionDataList> professionDataLists);

    ListProfessionDto toProfessionDto(ProfessionDataList professionDataList);

    UserData toUserData(UserDataDTO userDataDTO);

    List<UserData> toUserDataList(List<UserDataDTO> userDataDTOList);

    List<GeneralInitDataDTO> toGeneralInitDataDTOList(List<GeneralInitData> generalInitDataList);

    GeneralInitDataDTO toGeneralInitDataDTO(GeneralInitData generalInitData);

    ProfessionDtoOnePart toProfessionOnePartDTO(ProfessionOnePart professionOnePart);

    List<SelectedCategoriesDTO> toSelectedCategoriesDTOList(List<SelectedCategories> selectedCategories);

    SelectedCategoriesDTO toSelectCategoriesDTo(SelectedCategories selectedCategories);

    ListSelectedCategoriesDTO toListSelectCategoriesDTO(ListSelectedCategories listSelectedCategories);

    List<ListSelectedCategoriesDTO> toListCategoriesDTO(List<ListSelectedCategories> listSelectedCategories);
}
