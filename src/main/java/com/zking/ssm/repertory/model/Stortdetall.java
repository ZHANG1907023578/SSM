package com.zking.ssm.repertory.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Stortdetall implements Serializable{
    private String sdid;

    private String stid;

    private String gid;

    private Integer num;

    public Stortdetall(String sdid, String stid, String gid, Integer num) {
        this.sdid = sdid;
        this.stid = stid;
        this.gid = gid;
        this.num = num;
    }

    public Stortdetall() {
        super();
    }

    public String getSdid() {
        return sdid;
    }

    public void setSdid(String sdid) {
        this.sdid = sdid;
    }

    public String getStid() {
        return stid;
    }

    public void setStid(String stid) {
        this.stid = stid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}