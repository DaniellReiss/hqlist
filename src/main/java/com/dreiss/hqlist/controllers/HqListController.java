package com.dreiss.hqlist.controllers;

import com.dreiss.hqlist.dto.HqDTO;
import com.dreiss.hqlist.dto.HqListDTO;
import com.dreiss.hqlist.dto.HqMinDTO;
import com.dreiss.hqlist.services.HqListService;
import com.dreiss.hqlist.services.HqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class HqListController {

    @Autowired
    private HqListService hqListService;

    @GetMapping
    public List<HqListDTO> findAll(){
        List<HqListDTO> result = hqListService.findAll();
        return result;
    }

}
