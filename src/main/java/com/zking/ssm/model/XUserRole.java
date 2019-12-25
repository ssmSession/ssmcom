package com.zking.ssm.model;

import java.util.Objects;

/**
 * 用户角色桥接表
 */
public class XUserRole {
    private Integer userid;//用户ID
    private String roleid;//角色ID

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XUserRole xUserRole = (XUserRole) o;
        return Objects.equals(userid, xUserRole.userid) &&
                Objects.equals(roleid, xUserRole.roleid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, roleid);
    }
}
