package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.domain.GeneralInitData;
import com.filippov.restclient.restapi.dto.GeneralInitDataDTO;

import java.util.List;

public interface GeneralInitDataService {
    List<GeneralInitDataDTO>getList();
    GeneralInitDataDTO getData(Integer id);
}
