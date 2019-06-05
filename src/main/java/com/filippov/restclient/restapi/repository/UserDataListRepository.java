package com.filippov.restclient.restapi.repository;

import com.filippov.restclient.restapi.domain.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataListRepository extends JpaRepository<UserData,String> {

}
