package com.dreiss.hqlist.services;

import com.dreiss.hqlist.dto.HqMinDTO;
import com.dreiss.hqlist.entities.DC;
import com.dreiss.hqlist.repositories.HqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HqService {

    @Autowired
    private HqRepository hqRepository;

    public List<HqMinDTO> findAll() {
        List<DC> result = hqRepository.findAll();
        List<HqMinDTO> dto = result.stream().map(x -> new HqMinDTO(x)).toList();
        return dto;

    }


}
