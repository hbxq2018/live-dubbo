package com.xq.live.dubbo.dao;

import com.xq.live.dubbo.model.Shop;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopDao {

    int deleteByPrimaryKey(Long id);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}