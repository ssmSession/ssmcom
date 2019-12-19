package com.zking.ssm.model;

import java.util.Objects;

public class XDict {
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
        XDict xDict = (XDict) o;
        return Objects.equals(dicid, xDict.dicid) &&
                Objects.equals(dicname, xDict.dicname) &&
                Objects.equals(dictype, xDict.dictype) &&
                Objects.equals(dicvalue, xDict.dicvalue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dicid, dicname, dictype, dicvalue);
    }
}
