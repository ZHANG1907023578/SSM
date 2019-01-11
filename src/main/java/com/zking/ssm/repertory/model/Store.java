package com.zking.ssm.repertory.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Store implements Serializable{
    private String stid;

    private String name;

    private String eid;

    public Store(String stid, String name, String eid) {
        this.stid = stid;
        this.name = name;
        this.eid = eid;
    }

    public Store() {
        super();
    }

    public String getStid() {
        return stid;
    }

    public void setStid(String stid) {
        this.stid = stid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }
}