package com.zking.ssm.personnel.model;

import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;

@ToString
public class Emp implements Serializable{
    private String eid;

    private String username;

    private String pwd;

    private String ename;

    private String gender;

    private String email;

    private String tele;

    private String address;

    private Timestamp birthday;

    private String depid;

    private String timestamp;
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Emp(String eid, String username, String pwd, String ename, String gender, String email, String tele, String address, Timestamp birthday, String depid) {
        this.eid = eid;
        this.username = username;
        this.pwd = pwd;
        this.ename = ename;
        this.gender = gender;
        this.email = email;
        this.tele = tele;
        this.address = address;
        this.birthday = birthday;
        this.depid = depid;
    }

    public Emp() {
        super();
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }
}