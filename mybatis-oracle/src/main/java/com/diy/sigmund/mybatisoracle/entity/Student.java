package com.diy.sigmund.mybatisoracle.entity;

import java.util.StringJoiner;

public class Student {
    private Integer userid;

    private String username;

    private Integer age;

    private Long phone;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
            .add("userid=" + userid)
            .add("username='" + username + "'")
            .add("age=" + age)
            .add("phone=" + phone)
            .toString();
    }
}