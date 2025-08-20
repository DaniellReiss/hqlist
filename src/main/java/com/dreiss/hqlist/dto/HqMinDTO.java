package com.dreiss.hqlist.dto;

import com.dreiss.hqlist.entities.DC;

public class HqMinDTO {

    private Long id;
    private String title;
    private String genre;
    private Double score;
    private String imgUrl;

    public HqMinDTO(){

    }

    public HqMinDTO(DC entity) {
        id = entity.getId();
        title = entity.getTitle();
        genre = entity.getGenre();
        score = entity.getScore();
        imgUrl = entity.getImgUrl();
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public Double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
