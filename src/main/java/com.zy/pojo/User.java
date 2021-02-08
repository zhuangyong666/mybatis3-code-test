package com.zy.pojo;

/**
 * @author zhuangy
 * @version V1.0
 * @Title: User
 * @Package com.zy.pojo
 * @Description: (用一句话描述该文件做什么)
 * @date 2021/1/28 0028 15:39
 **/

public class User {
    private String id;
    private String username;
    private String passwrod;

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
