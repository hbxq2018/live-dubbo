package com.xq.live.dubbo.model;

import java.io.Serializable;

/**
 * ${DESCRIPTION}
 *
 * @author zhangpeng32
 * @date 2018-03-04 14:30
 * @copyright:hbxq
 **/
public class User implements Serializable {
    private Long id;

    private String userName;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
