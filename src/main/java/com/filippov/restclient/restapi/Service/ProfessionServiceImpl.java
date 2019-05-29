package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.domain.ProfessionDataList;
import com.filippov.restclient.restapi.dto.ListProfessionDto;
import com.filippov.restclient.restapi.dto.ProfessionDto;
import com.filippov.restclient.restapi.mapper.ProfessionMapper;
import com.filippov.restclient.restapi.repository.ProfessionDataListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("professionservice")
public class ProfessionServiceImpl implements ProfessionService {
    @Autowired
    private ProfessionDataListRepository professionDataListRepository;
    @Override
    public List<ListProfessionDto> getList() {
        List<ProfessionDataList> professionDataLists =new ArrayList<>(professionDataListRepository.findAll());
       List<ListProfessionDto>professionDtoList = new ArrayList<>(ProfessionMapper.PROFESSION_MAPPER.toListMessageDto(professionDataLists));
        return professionDtoList;
    }

    @Override
    public ProfessionDataList getId(Long id) {
        if(professionDataListRepository.findById(id).isPresent()){
           ProfessionDataList professionDataList = professionDataListRepository.findById(id).get();
        return professionDataList;
        } else {
            return null;
        }
    }


}



