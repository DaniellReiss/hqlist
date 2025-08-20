package com.dreiss.hqlist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "hq_id")
    private DC dc;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private HqList list;

    public BelongingPK() {

    }

    public BelongingPK(DC dc, HqList list) {
        this.dc = dc;
        this.list = list;
    }

    public DC getDc() {
        return dc;
    }

    public void setDc(DC dc) {
        this.dc = dc;
    }

    public HqList getList() {
        return list;
    }

    public void setList(HqList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(dc, that.dc) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dc, list);
    }
}
