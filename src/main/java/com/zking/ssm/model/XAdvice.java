package com.zking.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Objects;

@ToString
public class XAdvice {
    private String advid;
    private String advbt;
    private String advqk;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp advsj;
    private String advhf;
    private String advzr;



    public String getAdvid() {
        return advid;
    }

    public void setAdvid(String advid) {
        this.advid = advid;
    }

    public String getAdvbt() {
        return advbt;
    }

    public void setAdvbt(String advbt) {
        this.advbt = advbt;
    }

    public String getAdvqk() {
        return advqk;
    }

    public void setAdvqk(String advqk) {
        this.advqk = advqk;
    }

    public Timestamp getAdvsj() {
        return advsj;
    }

    public void setAdvsj(Timestamp advsj) {
        this.advsj = advsj;
    }

    public String getAdvhf() {
        return advhf;
    }

    public void setAdvhf(String advhf) {
        this.advhf = advhf;
    }

    public String getAdvzr() {
        return advzr;
    }

    public void setAdvzr(String advzr) {
        this.advzr = advzr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XAdvice xAdvice = (XAdvice) o;
        return Objects.equals(advid, xAdvice.advid) &&
                Objects.equals(advbt, xAdvice.advbt) &&
                Objects.equals(advqk, xAdvice.advqk) &&
                Objects.equals(advsj, xAdvice.advsj) &&
                Objects.equals(advhf, xAdvice.advhf) &&
                Objects.equals(advzr, xAdvice.advzr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(advid, advbt, advqk, advsj, advhf, advzr);
    }
}
