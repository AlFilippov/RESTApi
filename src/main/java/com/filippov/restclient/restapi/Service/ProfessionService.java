package com.filippov.restclient.restapi.Service;

import com.filippov.restclient.restapi.dto.ListProfessionDto;

import java.util.List;
public interface ProfessionService {
List<ListProfessionDto>getList();
ListProfessionDto getId(Long id);

}
