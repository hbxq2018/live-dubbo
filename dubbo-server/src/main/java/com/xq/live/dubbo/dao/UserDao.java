package com.xq.live.dubbo.dao;

import com.xq.live.dubbo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}