package com.zking.ssm.model;

import lombok.ToString;

import java.sql.Timestamp;
import java.util.Objects;

@ToString
public class XMeeting {
    private String meeid;
    private String meemc;
    private String meezt;
    private String meecc;
    private String meecbz;
    private Timestamp meezksj;
    private String meeaddress;
    private String meecjry;
    private String meelxr;
    private String meetel;
    private Integer meebmrs;

    public String getMeeid() {
        return meeid;
    }

    public void setMeeid(String meeid) {
        this.meeid = meeid;
    }

    public String getMeemc() {
        return meemc;
    }

    public void setMeemc(String meemc) {
        this.meemc = meemc;
    }

    public String getMeezt() {
        return meezt;
    }

    public void setMeezt(String meezt) {
        this.meezt = meezt;
    }

    public String getMeecc() {
        return meecc;
    }

    public void setMeecc(String meecc) {
        this.meecc = meecc;
    }

    public String getMeecbz() {
        return meecbz;
    }

    public void setMeecbz(String meecbz) {
        this.meecbz = meecbz;
    }

    public Timestamp getMeezksj() {
        return meezksj;
    }

    public void setMeezksj(Timestamp meezksj) {
        this.meezksj = meezksj;
    }

    public String getMeeaddress() {
        return meeaddress;
    }

    public void setMeeaddress(String meeaddress) {
        this.meeaddress = meeaddress;
    }

    public String getMeecjry() {
        return meecjry;
    }

    public void setMeecjry(String meecjry) {
        this.meecjry = meecjry;
    }

    public String getMeelxr() {
        return meelxr;
    }

    public void setMeelxr(String meelxr) {
        this.meelxr = meelxr;
    }

    public String getMeetel() {
        return meetel;
    }

    public void setMeetel(String meetel) {
        this.meetel = meetel;
    }

    public Integer getMeebmrs() {
        return meebmrs;
    }

    public void setMeebmrs(Integer meebmrs) {
        this.meebmrs = meebmrs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XMeeting xMeeting = (XMeeting) o;
        return Objects.equals(meeid, xMeeting.meeid) &&
                Objects.equals(meemc, xMeeting.meemc) &&
                Objects.equals(meezt, xMeeting.meezt) &&
                Objects.equals(meecc, xMeeting.meecc) &&
                Objects.equals(meecbz, xMeeting.meecbz) &&
                Objects.equals(meezksj, xMeeting.meezksj) &&
                Objects.equals(meeaddress, xMeeting.meeaddress) &&
                Objects.equals(meecjry, xMeeting.meecjry) &&
                Objects.equals(meelxr, xMeeting.meelxr) &&
                Objects.equals(meetel, xMeeting.meetel) &&
                Objects.equals(meebmrs, xMeeting.meebmrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meeid, meemc, meezt, meecc, meecbz, meezksj, meeaddress, meecjry, meelxr, meetel, meebmrs);
    }
}
