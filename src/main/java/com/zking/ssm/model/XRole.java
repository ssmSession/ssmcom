package com.zking.ssm.model;

import java.util.Objects;

/**
 * 角色表
 */
public class XRole {
    private String roleid;
    private String rolename;
    private String roleremark;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoleremark() {
        return roleremark;
    }

    public void setRoleremark(String roleremark) {
        this.roleremark = roleremark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XRole xRole = (XRole) o;
        return Objects.equals(roleid, xRole.roleid) &&
                Objects.equals(rolename, xRole.rolename) &&
                Objects.equals(roleremark, xRole.roleremark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleid, rolename, roleremark);
    }
}
