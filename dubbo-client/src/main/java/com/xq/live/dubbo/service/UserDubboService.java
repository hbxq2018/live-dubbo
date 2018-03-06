package com.xq.live.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xq.live.dubbo.api.UserService;
import com.xq.live.dubbo.model.User;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author zhangpeng32
 * @date 2018-03-06 14:23
 * @copyright:hbxq
 **/
@Service
public class UserDubboService {
    @Reference(version = "1.0.0")
    private UserService userService;

    public User getUserByName(String name){
        return userService.getUserByName(name);
    }
}
