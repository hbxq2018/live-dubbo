package com.xq.live.dubbo.api;

import com.xq.live.dubbo.model.User;

/**
 * ${DESCRIPTION}
 *
 * @author zhangpeng32
 * @date 2018-03-04 14:29
 * @copyright:hbxq
 **/
public interface UserService{
    User getUserByName(String name);
}
