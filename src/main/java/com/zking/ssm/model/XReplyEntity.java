package com.zking.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 采用稿表
 */
@ToString
public class XReplyEntity implements Serializable{
    private Integer repid;

    private String repname;

    private String repdw;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date repdate;

    private String repdorr;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date repdates;

    private String rephfbm;



    public XReplyEntity(Integer repid, String repname, String repdw, Date repdate, String repdorr, Date repdates, String rephfbm) {
        this.repid = repid;
        this.repname = repname;
        this.repdw = repdw;
        this.repdate = repdate;
        this.repdorr = repdorr;
        this.repdates = repdates;
        this.rephfbm = rephfbm;
    }

    public String getRephfbm() {
        return rephfbm;
    }

    public void setRephfbm(String rephfbm) {
        this.rephfbm = rephfbm;
    }

    public String getRepdorr() {
        return repdorr;
    }

    public void setRepdorr(String repdorr) {
        this.repdorr = repdorr;
    }

    public Date getRepdates() {
        return repdates;
    }

    public void setRepdates(Date repdates) {
        this.repdates = repdates;
    }

    public XReplyEntity() {
        super();
    }

    public Integer getRepid() {
        return repid;
    }

    public void setRepid(Integer repid) {
        this.repid = repid;
    }

    public String getRepname() {
        return repname;
    }

    public void setRepname(String repname) {
        this.repname = repname;
    }

    public String getRepdw() {
        return repdw;
    }

    public void setRepdw(String repdw) {
        this.repdw = repdw;
    }

    public Date getRepdate() {
        return repdate;
    }

    public void setRepdate(Date repdate) {
        this.repdate = repdate;
    }

}