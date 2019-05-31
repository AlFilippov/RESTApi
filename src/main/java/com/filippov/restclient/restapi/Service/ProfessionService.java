package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.domain.ProfessionDataList;
import com.filippov.restclient.restapi.dto.ListProfessionDto;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ProfessionService {
List<ListProfessionDto>getList();
ListProfessionDto getId(Long id);

}
