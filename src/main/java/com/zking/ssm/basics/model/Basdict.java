package com.zking.ssm.basics.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Basdict implements Serializable{
    private String dictid;

    private String dicttype;

    private String dictvalue;

    public Basdict(String dictid, String dicttype, String dictvalue) {
        this.dictid = dictid;
        this.dicttype = dicttype;
        this.dictvalue = dictvalue;
    }

    public Basdict() {
        super();
    }

    public String getDictid() {
        return dictid;
    }

    public void setDictid(String dictid) {
        this.dictid = dictid;
    }

    public String getDicttype() {
        return dicttype;
    }

    public void setDicttype(String dicttype) {
        this.dicttype = dicttype;
    }

    public String getDictvalue() {
        return dictvalue;
    }

    public void setDictvalue(String dictvalue) {
        this.dictvalue = dictvalue;
    }
}