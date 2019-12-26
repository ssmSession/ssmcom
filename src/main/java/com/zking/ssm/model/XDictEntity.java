package com.zking.ssm.model;

import lombok.ToString;

import java.util.Objects;

/**
 * 字典表
 */
@ToString
public class XDictEntity {
    private String dicid;
    private String dicname;
    private String dictype;
    private String dicvalue;

    public String getDicid() {
        return dicid;
    }

    public void setDicid(String dicid) {
        this.dicid = dicid;
    }

    public String getDicname() {
        return dicname;
    }

    public void setDicname(String dicname) {
        this.dicname = dicname;
    }

    public String getDictype() {
        return dictype;
    }

    public void setDictype(String dictype) {
        this.dictype = dictype;
    }

    public String getDicvalue() {
        return dicvalue;
    }

    public void setDicvalue(String dicvalue) {
        this.dicvalue = dicvalue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XDictEntity that = (XDictEntity) o;
        return Objects.equals(dicid, that.dicid) &&
                Objects.equals(dicname, that.dicname) &&
                Objects.equals(dictype, that.dictype) &&
                Objects.equals(dicvalue, that.dicvalue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dicid, dicname, dictype, dicvalue);
    }
}
