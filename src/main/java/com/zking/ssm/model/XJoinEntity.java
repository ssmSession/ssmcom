package com.zking.ssm.model;

import java.util.Objects;

public class XJoinEntity {
    private String joinid;
    private String joinname;

    public String getJoinid() {
        return joinid;
    }

    public void setJoinid(String joinid) {
        this.joinid = joinid;
    }

    public String getJoinname() {
        return joinname;
    }

    public void setJoinname(String joinname) {
        this.joinname = joinname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XJoinEntity that = (XJoinEntity) o;
        return Objects.equals(joinid, that.joinid) &&
                Objects.equals(joinname, that.joinname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(joinid, joinname);
    }
}
