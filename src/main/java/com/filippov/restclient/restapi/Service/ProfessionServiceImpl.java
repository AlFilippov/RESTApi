package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.domain.ProfessionDataList;
import com.filippov.restclient.restapi.dto.ListProfessionDto;
import com.filippov.restclient.restapi.mapper.ProfessionMapper;
import com.filippov.restclient.restapi.repository.ProfessionDataListRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("professionservice")
public class ProfessionServiceImpl implements ProfessionService {
    private final ProfessionDataListRepository professionDataListRepository;

    public ProfessionServiceImpl(ProfessionDataListRepository professionDataListRepository) {
        this.professionDataListRepository = professionDataListRepository;
    }

    @Override
    public List<ListProfessionDto> getList() {
        List<ProfessionDataList> professionDataLists = new ArrayList<>(professionDataListRepository.findAll());
        List<ListProfessionDto> professionDtoList = new ArrayList<>(ProfessionMapper.PROFESSION_MAPPER.toListMessageDto(professionDataLists));
        return professionDtoList;
    }

    @Override
    public ListProfessionDto getId(Long id) {
        if (professionDataListRepository.findById(id).isPresent()) {
            ProfessionDataList professionDataList = professionDataListRepository.findById(id).get();
            ListProfessionDto listProfessionDto = ProfessionMapper.PROFESSION_MAPPER.toProfessionDto(professionDataList);

            return listProfessionDto;
        } else {
            return null;
        }
    }


}



