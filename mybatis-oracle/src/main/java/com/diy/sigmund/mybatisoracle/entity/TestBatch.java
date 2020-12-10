package com.diy.sigmund.mybatisoracle.entity;

/**
 * @author ylm-sigmund
 * @since 2020/12/7 21:49
 */
public class TestBatch {
    private Integer userId;
    private String userName;
    private Integer age;
    private Long phone;
    private String currencyOne;
    private Long countOne;
    private String currencyTwo;
    private Long countTwo;
    private String createTime;
    private String updateTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getCurrencyOne() {
        return currencyOne;
    }

    public void setCurrencyOne(String currencyOne) {
        this.currencyOne = currencyOne;
    }

    public Long getCountOne() {
        return countOne;
    }

    public void setCountOne(Long countOne) {
        this.countOne = countOne;
    }

    public String getCurrencyTwo() {
        return currencyTwo;
    }

    public void setCurrencyTwo(String currencyTwo) {
        this.currencyTwo = currencyTwo;
    }

    public Long getCountTwo() {
        return countTwo;
    }

    public void setCountTwo(Long countTwo) {
        this.countTwo = countTwo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
