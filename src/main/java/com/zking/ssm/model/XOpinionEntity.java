package com.zking.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * 民意表
 */
public class XOpinionEntity {
    private Integer opid;
    private String oplgbt;//来稿标题
    private String oplgrordw;//大类（字典）来稿人/单位
    private String optel;//小类（字典）
    private String opbsrsf;//来搞人或者单位

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date opbssj;//联系电话
    private String opbsr;//报送人身份
    private String opqfld;//报送时间
    private Integer opsfgk;//报送人
    private String opjtnr;//签发领导
    private String fileid;//是否公开 默认0  0是 1否
    private Integer proid;//具体内容
    private String opgjzt;//文件Id(外键：文件表)
    private String opdwllx;//单位类型（默认为1）
    private String opbgfs;//报关方式
    private String opfyr;//

    private String statr;

    private String end;

    public String getStatr() {
        return statr;
    }

    public void setStatr(String statr) {
        this.statr = statr;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public XOpinionEntity() {
    }

    public XOpinionEntity(Integer opid, String oplgbt, String oplgrordw, String optel, String opbsrsf, Date opbssj, String opbsr, String opqfld, Integer opsfgk, String opjtnr, String fileid, Integer proid, String opgjzt, String opdwllx, String opbgfs, String opfyr) {
        this.opid = opid;
        this.oplgbt = oplgbt;
        this.oplgrordw = oplgrordw;
        this.optel = optel;
        this.opbsrsf = opbsrsf;
        this.opbssj = opbssj;
        this.opbsr = opbsr;
        this.opqfld = opqfld;
        this.opsfgk = opsfgk;
        this.opjtnr = opjtnr;
        this.fileid = fileid;
        this.proid = proid;
        this.opgjzt = opgjzt;
        this.opdwllx = opdwllx;
        this.opbgfs = opbgfs;
        this.opfyr = opfyr;
    }

    public Integer getOpid() {
        return opid;
    }

    public void setOpid(Integer opid) {
        this.opid = opid;
    }

    public String getOplgbt() {
        return oplgbt;
    }

    public void setOplgbt(String oplgbt) {
        this.oplgbt = oplgbt;
    }

    public String getOplgrordw() {
        return oplgrordw;
    }

    public void setOplgrordw(String oplgrordw) {
        this.oplgrordw = oplgrordw;
    }

    public String getOptel() {
        return optel;
    }

    public void setOptel(String optel) {
        this.optel = optel;
    }

    public String getOpbsrsf() {
        return opbsrsf;
    }

    public void setOpbsrsf(String opbsrsf) {
        this.opbsrsf = opbsrsf;
    }

    public Date getOpbssj() {
        return opbssj;
    }

    public void setOpbssj(Date opbssj) {
        this.opbssj = opbssj;
    }

    public String getOpbsr() {
        return opbsr;
    }

    public void setOpbsr(String opbsr) {
        this.opbsr = opbsr;
    }

    public String getOpqfld() {
        return opqfld;
    }

    public void setOpqfld(String opqfld) {
        this.opqfld = opqfld;
    }

    public Integer getOpsfgk() {
        return opsfgk;
    }

    public void setOpsfgk(Integer opsfgk) {
        this.opsfgk = opsfgk;
    }

    public String getOpjtnr() {
        return opjtnr;
    }

    public void setOpjtnr(String opjtnr) {
        this.opjtnr = opjtnr;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public String getOpgjzt() {
        return opgjzt;
    }

    public void setOpgjzt(String opgjzt) {
        this.opgjzt = opgjzt;
    }

    public String getOpdwllx() {
        return opdwllx;
    }

    public void setOpdwllx(String opdwllx) {
        this.opdwllx = opdwllx;
    }

    public String getOpbgfs() {
        return opbgfs;
    }

    public void setOpbgfs(String opbgfs) {
        this.opbgfs = opbgfs;
    }

    public String getOpfyr() {
        return opfyr;
    }

    public void setOpfyr(String opfyr) {
        this.opfyr = opfyr;
    }
}
