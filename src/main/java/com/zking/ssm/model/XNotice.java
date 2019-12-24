package com.zking.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class XNotice {
    private String notid;
    private String notbt;
    private String notinfo;
    private String nottype;
    private String notren;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date notdate;
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

    public Date getNotdate() {
        return notdate;
    }

    public void setNotdate(Date notdate) {
        this.notdate = notdate;
    }

    public String getNotxspt() {
        return notxspt;
    }

    public void setNotxspt(String notxspt) {
        this.notxspt = notxspt;
    }


}
