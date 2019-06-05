package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.domain.UserData;
import com.filippov.restclient.restapi.dto.UserDataDTO;

import java.util.List;

public interface UserDataService {
    UserData saveData(UserDataDTO userDataDTO);
    List<UserData> saveDataList(List<UserDataDTO> dataListDTO);
}
