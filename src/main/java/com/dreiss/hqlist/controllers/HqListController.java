package com.dreiss.hqlist.controllers;

import com.dreiss.hqlist.dto.HqDTO;
import com.dreiss.hqlist.dto.HqListDTO;
import com.dreiss.hqlist.dto.HqMinDTO;
import com.dreiss.hqlist.dto.ReplacementDTO;
import com.dreiss.hqlist.services.HqListService;
import com.dreiss.hqlist.services.HqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class HqListController {

    @Autowired
    private HqListService hqListService;

    @Autowired
    private HqService hqService;

    @GetMapping
    public List<HqListDTO> findAll(){
        List<HqListDTO> result = hqListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/dc")
    public List<HqMinDTO> findByList(@PathVariable Long listId){
        List<HqMinDTO> result = hqService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        hqListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }

}
