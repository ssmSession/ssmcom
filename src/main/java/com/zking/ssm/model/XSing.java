package com.zking.ssm.model;

import lombok.ToString;

import java.sql.Timestamp;
import java.util.Objects;

@ToString
public class XSing {
    private Integer singid;
    private Integer userid;
    private String singwyzh;
    private Timestamp singrcsj;
    private Timestamp singccsj;
    private String singkqqk;

    public Integer getSingid() {
        return singid;
    }

    public void setSingid(Integer singid) {
        this.singid = singid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSingwyzh() {
        return singwyzh;
    }

    public void setSingwyzh(String singwyzh) {
        this.singwyzh = singwyzh;
    }

    public Timestamp getSingrcsj() {
        return singrcsj;
    }

    public void setSingrcsj(Timestamp singrcsj) {
        this.singrcsj = singrcsj;
    }

    public Timestamp getSingccsj() {
        return singccsj;
    }

    public void setSingccsj(Timestamp singccsj) {
        this.singccsj = singccsj;
    }

    public String getSingkqqk() {
        return singkqqk;
    }

    public void setSingkqqk(String singkqqk) {
        this.singkqqk = singkqqk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XSing xSing = (XSing) o;
        return Objects.equals(singid, xSing.singid) &&
                Objects.equals(userid, xSing.userid) &&
                Objects.equals(singwyzh, xSing.singwyzh) &&
                Objects.equals(singrcsj, xSing.singrcsj) &&
                Objects.equals(singccsj, xSing.singccsj) &&
                Objects.equals(singkqqk, xSing.singkqqk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(singid, userid, singwyzh, singrcsj, singccsj, singkqqk);
    }
}
