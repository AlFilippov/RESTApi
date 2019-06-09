package com.filippov.restclient.restapi.controller;

import com.filippov.restclient.restapi.Service.UserDataServiceImpl;
import com.filippov.restclient.restapi.dto.UserDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profession/users")
public class UserDataController {
    @Autowired
    private UserDataServiceImpl userDataService;

//    @PostMapping
//    public ResponseEntity<UserDataDTO> getUserData(@RequestBody UserDataDTO userDataDTO) {
//        userDataService.saveData(userDataDTO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(userDataDTO);
//    }
   @PostMapping
   public ResponseEntity<List<UserDataDTO>>saveListUserData(@RequestBody List<UserDataDTO> userDataDTOList){
       userDataService.saveDataList(userDataDTOList);
      return ResponseEntity.status(HttpStatus.CREATED).body(userDataDTOList);
   }
}
