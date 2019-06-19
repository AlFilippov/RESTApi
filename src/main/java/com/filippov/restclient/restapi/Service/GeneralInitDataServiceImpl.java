package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.domain.GeneralInitData;
import com.filippov.restclient.restapi.dto.GeneralInitDataDTO;
import com.filippov.restclient.restapi.mapper.ProfessionMapper;
import com.filippov.restclient.restapi.repository.GeneralInitDataRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("generalinitdataservice")
public class GeneralInitDataServiceImpl implements GeneralInitDataService {
    private final GeneralInitDataRepository generalInitDataRepository;

    public GeneralInitDataServiceImpl(GeneralInitDataRepository generalInitDataRepository) {
        this.generalInitDataRepository = generalInitDataRepository;
    }

    @Override
    public List<GeneralInitDataDTO> getList() {
       List<GeneralInitData> generalInitData = new ArrayList<>(generalInitDataRepository.findAll());
        return new ArrayList<>(ProfessionMapper.PROFESSION_MAPPER.toGeneralInitDataDTOList(generalInitData));
    }

    @Override
    public GeneralInitDataDTO getData(Integer id) {
        if(generalInitDataRepository.findById(id).isPresent()){
          GeneralInitData generalInitData = generalInitDataRepository.findById(id).get();
           GeneralInitDataDTO generalInitDataDTO = ProfessionMapper.PROFESSION_MAPPER.toGeneralInitDataDTO(generalInitData);
            return  generalInitDataDTO;
        } else {
            return null;
        }
    }

}
