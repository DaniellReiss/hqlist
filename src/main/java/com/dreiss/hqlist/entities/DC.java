package com.dreiss.hqlist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_dc")
public class DC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "hq_year")
    private Integer year;
    private String genre;
    private String authors;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public DC() {

    }

    public DC(Long id, String title, Integer year, String genre, String authors, String imgUrl,
              String shortDescription, String longDescription){

        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.authors = authors;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    //Comparar Objeto com o outro == hashcode and equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DC dc = (DC) o;
        return Objects.equals(id, dc.id);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
