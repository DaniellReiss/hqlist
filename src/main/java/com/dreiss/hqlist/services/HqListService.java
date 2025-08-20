package com.dreiss.hqlist.services;

import com.dreiss.hqlist.dto.HqListDTO;
import com.dreiss.hqlist.entities.HqList;
import com.dreiss.hqlist.repositories.HqListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HqListService {

    @Autowired
    private HqListRepository hqListRepository;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<HqListDTO> findAll() {
        List<HqList> result = hqListRepository.findAll();
        return result.stream().map(x -> new HqListDTO(x)).toList();


    }


}
