package com.dreiss.hqlist.services;

import com.dreiss.hqlist.dto.HqDTO;
import com.dreiss.hqlist.dto.HqMinDTO;
import com.dreiss.hqlist.entities.DC;
import com.dreiss.hqlist.projections.HqMinProjection;
import com.dreiss.hqlist.repositories.HqRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HqService {

    @Autowired
    private HqRepository hqRepository;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public HqDTO findById(Long id) {
        DC result = hqRepository.findById(id).get();
        HqDTO dto = new HqDTO(result);
        return dto;
    }

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<HqMinDTO> findAll() {
        List<DC> result = hqRepository.findAll();
        List<HqMinDTO> dto = result.stream().map(x -> new HqMinDTO(x)).toList();
        return dto;

    }

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<HqMinDTO> findByList(Long listId) {
        List<HqMinProjection> result = hqRepository.searchByList(listId);
        List<HqMinDTO> dto = result.stream().map(x -> new HqMinDTO(x)).toList();
        return dto;

    }




}
