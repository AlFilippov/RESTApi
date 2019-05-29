package com.filippov.restclient.restapi.repository;

import com.filippov.restclient.restapi.domain.ProfessionDataList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ProfessionDataListRepository extends JpaRepository<ProfessionDataList,Long> {

}

