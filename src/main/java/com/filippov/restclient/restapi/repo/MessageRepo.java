package com.filippov.restclient.restapi.repo;

import com.filippov.restclient.restapi.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message,Integer>{
}
