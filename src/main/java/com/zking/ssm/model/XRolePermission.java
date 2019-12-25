package com.zking.ssm.model;

import java.util.Objects;

/**
 * 角色权限桥接表
 */
public class XRolePermission {
    private String roleid;
    private String perid;


    private String [] p;

    public String[] getP() {
        return p;
    }

    public void setP(String[] p) {
        this.p = p;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XRolePermission that = (XRolePermission) o;
        return Objects.equals(roleid, that.roleid) &&
                Objects.equals(perid, that.perid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleid, perid);
    }
}
