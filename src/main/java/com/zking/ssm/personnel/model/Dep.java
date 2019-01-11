package com.zking.ssm.personnel.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Dep implements Serializable{
    private String depid;

    private String dname;

    private String tel;

    public Dep(String depid, String dname, String tel) {
        this.depid = depid;
        this.dname = dname;
        this.tel = tel;
    }

    public Dep() {
        super();
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}