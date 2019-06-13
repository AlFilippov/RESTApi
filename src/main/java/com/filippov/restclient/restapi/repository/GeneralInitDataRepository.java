package com.filippov.restclient.restapi.repository;

import com.filippov.restclient.restapi.domain.GeneralInitData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralInitDataRepository extends JpaRepository<GeneralInitData,Integer> {
}
