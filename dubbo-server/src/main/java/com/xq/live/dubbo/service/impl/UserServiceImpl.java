package com.xq.live.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xq.live.dubbo.api.UserService;
import com.xq.live.dubbo.model.User;

/**
 * ${DESCRIPTION}
 *
 * @author zhangpeng32
 * @date 2018-03-04 14:25
 * @copyright:hbxq
 **/
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public User getUserByName(String name) {
        User user = new User();
        user.setId(1L);
        user.setUserName("fuck u");
        user.setPassword("123456");
        return user;
    }
}
