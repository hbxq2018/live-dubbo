package com.xq.live.dubbo.service;

import com.xq.live.dubbo.common.BaseResp;

/**
 * @package: com.xq.live.dubbo.common
 * @description: 基础接口类
 * @author: zhangpeng32
 * @date: 2018/3/25 12:27
 * @version: 1.0
 */
public interface BaseSerivce<T> {
    /**
     * 新增记录
     * @param t
     * @return
     */
    public BaseResp<Long> create(T t);

    /**
     * 根据主键删除
     * @param pk
     * @return
     */
    public BaseResp<Integer> delete(Long pk);

    /**
     * 根据主键更新记录
     * @param t
     * @return
     */
    public BaseResp<Integer> update(T t);

    /**
     * 根据主键查询
     * @param pk
     * @return
     */
    public BaseResp<T> get(Long pk);
}
