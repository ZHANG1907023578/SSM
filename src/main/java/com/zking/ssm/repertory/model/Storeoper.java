package com.zking.ssm.repertory.model;

import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@ToString
public class Storeoper implements Serializable {
    private String soid;

    private String eid;

    private Timestamp opertime;

    private String sdid;

    private String gid;

    private Integer num;

    private String type;

    private String timebetween;

    public String getTimebetween() {
        return timebetween;
    }

    public void setTimebetween(String timebetween) {
        this.timebetween = timebetween;
    }

    public Storeoper(String soid, String eid, Timestamp opertime, String sdid, String gid, Integer num, String type, String timebetween) {
        this.soid = soid;
        this.eid = eid;
        this.opertime = opertime;
        this.sdid = sdid;
        this.gid = gid;
        this.num = num;
        this.type = type;
        this.timebetween = timebetween;
    }

    public Storeoper() {
        super();
    }

    public String getSoid() {
        return soid;
    }

    public void setSoid(String soid) {
        this.soid = soid;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public Timestamp getOpertime() {
        return opertime;
    }

    public void setOpertime(Timestamp opertime) {
        this.opertime = opertime;
    }

    public String getSdid() {
        return sdid;
    }

    public void setSdid(String sdid) {
        this.sdid = sdid;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}