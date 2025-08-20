package com.dreiss.hqlist.dto;

import com.dreiss.hqlist.entities.HqList;

public class HqListDTO {

    private Long id;
    private String name;

    public HqListDTO() {
    }

    public HqListDTO(HqList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
