package com.diy.sigmund.mybatisoracle.entity;

/**
 * @author ylm-sigmund
 * @since 2021/2/25 22:00
 */
public class MyMessage {
    private String userId;
    private String message;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
