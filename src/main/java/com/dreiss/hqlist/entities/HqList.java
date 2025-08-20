package com.dreiss.hqlist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_hq_list")
public class HqList {

    public HqList(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    public HqList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HqList hqList = (HqList) o;
        return Objects.equals(id, hqList.id);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
