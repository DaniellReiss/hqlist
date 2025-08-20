package com.dreiss.hqlist.controllers;

import com.dreiss.hqlist.dto.HqMinDTO;
import com.dreiss.hqlist.entities.DC;
import com.dreiss.hqlist.services.HqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/hq")
public class HqController {

    @Autowired
    private HqService hqService;

    @GetMapping
    public List<HqMinDTO> findAll(){
        List<HqMinDTO> result = hqService.findAll();
        return result;

    }

}
