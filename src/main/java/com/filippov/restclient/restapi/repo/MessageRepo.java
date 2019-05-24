package com.filippov.restclient.restapi.repo;

import com.filippov.restclient.restapi.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends JpaRepository<Message,Integer>{
}
