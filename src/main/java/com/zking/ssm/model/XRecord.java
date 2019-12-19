package com.zking.ssm.model;

import lombok.ToString;

import java.sql.Timestamp;
import java.util.Objects;

@ToString
public class XRecord {
    private String recid;
    private String recbt;
    private String rechy;
    private Timestamp recsj;
    private Float recdf;
    private Integer recpm;

    public String getRecid() {
        return recid;
    }

    public void setRecid(String recid) {
        this.recid = recid;
    }

    public String getRecbt() {
        return recbt;
    }

    public void setRecbt(String recbt) {
        this.recbt = recbt;
    }

    public String getRechy() {
        return rechy;
    }

    public void setRechy(String rechy) {
        this.rechy = rechy;
    }

    public Timestamp getRecsj() {
        return recsj;
    }

    public void setRecsj(Timestamp recsj) {
        this.recsj = recsj;
    }

    public Float getRecdf() {
        return recdf;
    }

    public void setRecdf(Float recdf) {
        this.recdf = recdf;
    }

    public Integer getRecpm() {
        return recpm;
    }

    public void setRecpm(Integer recpm) {
        this.recpm = recpm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XRecord xRecord = (XRecord) o;
        return Objects.equals(recid, xRecord.recid) &&
                Objects.equals(recbt, xRecord.recbt) &&
                Objects.equals(rechy, xRecord.rechy) &&
                Objects.equals(recsj, xRecord.recsj) &&
                Objects.equals(recdf, xRecord.recdf) &&
                Objects.equals(recpm, xRecord.recpm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recid, recbt, rechy, recsj, recdf, recpm);
    }
}
