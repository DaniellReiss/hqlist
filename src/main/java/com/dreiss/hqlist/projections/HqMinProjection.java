package com.dreiss.hqlist.projections;

public interface HqMinProjection {

    Long getId();
    String getTitle();
    String getGenre();
    String getImgUrl();
    Double getScore();
    Integer getPosition();
}
