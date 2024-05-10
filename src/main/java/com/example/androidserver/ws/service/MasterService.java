package com.example.androidserver.ws.service;

import com.example.androidserver.ws.model.entity.MasterEntity;
import com.example.androidserver.ws.model.response.MasterResponse;
import com.example.androidserver.ws.repository.MasterRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MasterService {

    private final MasterRepository masterRepository;
    private final ModelMapper modelMapper;


    public MasterService(MasterRepository masterRepository, ModelMapper modelMapper) {
        this.masterRepository = masterRepository;
        this.modelMapper = modelMapper;
    }

    public MasterResponse getMaster(String publicId) {
        MasterEntity entity = masterRepository.findByPublicId(publicId).get();
        if (entity != null)
            return modelMapper.map(entity,MasterResponse.class);
        throw  new RuntimeException();
    }


}
