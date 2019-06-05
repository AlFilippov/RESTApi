package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.domain.UserData;
import com.filippov.restclient.restapi.dto.UserDataDTO;
import com.filippov.restclient.restapi.mapper.ProfessionMapper;
import com.filippov.restclient.restapi.repository.UserDataListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userdataservice")
public class UserDataServiceImpl implements UserDataService {
    @Autowired
    private UserDataListRepository userDataListRepository;
    @Override
    public UserData saveData(UserDataDTO userDataDTO) {
 return userDataListRepository.save(ProfessionMapper.PROFESSION_MAPPER.toUserData(userDataDTO));
    }

    @Override
    public List<UserData> saveDataList(List<UserDataDTO> dataListDTO) {
        return userDataListRepository.saveAll(ProfessionMapper.PROFESSION_MAPPER.toUserDataList(dataListDTO));
    }


}
