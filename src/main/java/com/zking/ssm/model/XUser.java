package com.zking.ssm.model;

import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@ToString
public class XUser {
    private Integer id;
    private String username;
    private String password;
    private String salt;
    private String name;
    private String sex;
    private Integer age;
    private String tel;
    private String other;
    private String roleid;
    private String state;
    private Timestamp addItme;
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Timestamp getAddItme() {
        return addItme;
    }

    public void setAddItme(Timestamp addItme) {
        this.addItme = addItme;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XUser xUser = (XUser) o;
        return Objects.equals(id, xUser.id) &&
                Objects.equals(username, xUser.username) &&
                Objects.equals(password, xUser.password) &&
                Objects.equals(salt, xUser.salt) &&
                Objects.equals(name, xUser.name) &&
                Objects.equals(sex, xUser.sex) &&
                Objects.equals(age, xUser.age) &&
                Objects.equals(tel, xUser.tel) &&
                Objects.equals(other, xUser.other) &&
                Objects.equals(roleid, xUser.roleid) &&
                Objects.equals(state, xUser.state) &&
                Objects.equals(addItme, xUser.addItme) &&
                Objects.equals(remark, xUser.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, salt, name, sex, age, tel, other, roleid, state, addItme, remark);
    }
}
