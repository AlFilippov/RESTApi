package com.filippov.restclient.restapi.repository;

import com.filippov.restclient.restapi.domain.ProfessionOnePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionOnePartRepository extends JpaRepository<ProfessionOnePart,Integer> {
}
