package com.filippov.restclient.restapi.controller;

import com.filippov.restclient.restapi.Service.GeneralInitDataServiceImpl;
import com.filippov.restclient.restapi.Service.ProfessionServiceImpl;
import com.filippov.restclient.restapi.dto.GeneralInitDataDTO;
import com.filippov.restclient.restapi.dto.ListProfessionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("data")
@RestController
public class ProfessionController {

    private final ProfessionServiceImpl professionService;
    private final GeneralInitDataServiceImpl generalInitDataService;

    public ProfessionController(ProfessionServiceImpl professionService, GeneralInitDataServiceImpl generalInitDataService) {
        this.professionService = professionService;
        this.generalInitDataService = generalInitDataService;
    }


    @GetMapping
    public ResponseEntity<List<GeneralInitDataDTO>> getAllProfession() {
        return ResponseEntity.ok(generalInitDataService.getList());
    }
    @GetMapping("/profession/info")
    public ResponseEntity<GeneralInitDataDTO>findById(@RequestParam(value ="id") int id ){
        return ResponseEntity.ok(generalInitDataService.getData(id));
    }

    @GetMapping("/profession")
    public ResponseEntity<ListProfessionDto>findById(@RequestParam(value = "id")long id){
        return ResponseEntity.ok(professionService.getId(id));
    }
}





