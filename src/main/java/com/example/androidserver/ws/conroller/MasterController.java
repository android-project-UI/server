package com.example.androidserver.ws.conroller;


import com.example.androidserver.shared.BaseApiResponse;
import com.example.androidserver.ws.service.MasterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/master")
public class MasterController {

    private final MasterService masterService;

    public MasterController(MasterService masterService) {
        this.masterService = masterService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<BaseApiResponse> getMaster(@PathVariable String id){
        return new ResponseEntity<BaseApiResponse>(
                BaseApiResponse.builder()
                .status(true)
                .message("")
                .date(new Date())
                .result(masterService.getMaster(id))
                .build(), HttpStatus.OK);
    }

}
