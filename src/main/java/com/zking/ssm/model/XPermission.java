package com.zking.ssm.model;

import java.util.Objects;

/**
 * 权限表
 */
public class XPermission {
    private String perid;
    private String pername;
    private String pid;
    private String perurl;

    private String roleid;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }


    public String getPerid() {
        return perid;
    }

    public void setPerid(String perid) {
        this.perid = perid;
    }

    public String getPername() {
        return pername;
    }

    public void setPername(String pername) {
        this.pername = pername;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPerurl() {
        return perurl;
    }

    public void setPerurl(String perurl) {
        this.perurl = perurl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XPermission that = (XPermission) o;
        return Objects.equals(perid, that.perid) &&
                Objects.equals(pername, that.pername) &&
                Objects.equals(pid, that.pid) &&
                Objects.equals(perurl, that.perurl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(perid, pername, pid, perurl);
    }
}
