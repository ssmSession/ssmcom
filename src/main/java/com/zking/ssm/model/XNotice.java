package com.zking.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * 通知表
 */
public class XNotice {
    private String notid;
    private String notbt;
    private String notinfo;
    private String nottype;
    private String notren;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp notdate;
    private String notxspt;


    private String start;
    private String end;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
    public String getNotid() {
        return notid;
    }

    public void setNotid(String notid) {
        this.notid = notid;
    }

    public String getNotbt() {
        return notbt;
    }

    public void setNotbt(String notbt) {
        this.notbt = notbt;
    }

    public String getNotinfo() {
        return notinfo;
    }

    public void setNotinfo(String notinfo) {
        this.notinfo = notinfo;
    }

    public String getNottype() {
        return nottype;
    }

    public void setNottype(String nottype) {
        this.nottype = nottype;
    }

    public String getNotren() {
        return notren;
    }

    public void setNotren(String notren) {
        this.notren = notren;
    }

    public Timestamp getNotdate() {
        return notdate;
    }

    public void setNotdate(Timestamp notdate) {
        this.notdate = notdate;
    }

    public String getNotxspt() {
        return notxspt;
    }

    public void setNotxspt(String notxspt) {
        this.notxspt = notxspt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XNotice xNotice = (XNotice) o;
        return Objects.equals(notid, xNotice.notid) &&
                Objects.equals(notbt, xNotice.notbt) &&
                Objects.equals(notinfo, xNotice.notinfo) &&
                Objects.equals(nottype, xNotice.nottype) &&
                Objects.equals(notren, xNotice.notren) &&
                Objects.equals(notdate, xNotice.notdate) &&
                Objects.equals(notxspt, xNotice.notxspt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notid, notbt, notinfo, nottype, notren, notdate, notxspt);
    }
}
