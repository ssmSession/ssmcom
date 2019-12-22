package com.zking.ssm.model;

import java.util.Objects;


public class XVoteEntity {
    private Integer voteid;
    private String opname;
    private Integer proid;

    public Integer getVoteid() {
        return voteid;
    }

    public void setVoteid(Integer voteid) {
        this.voteid = voteid;
    }

    public String getOpname() {
        return opname;
    }

    public void setOpname(String opname) {
        this.opname = opname;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XVoteEntity that = (XVoteEntity) o;
        return Objects.equals(voteid, that.voteid) &&
                Objects.equals(opname, that.opname) &&
                Objects.equals(proid, that.proid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voteid, opname, proid);
    }
}
