package com.xq.live.dubbo.api;

import com.xq.live.dubbo.common.BaseResp;
import com.xq.live.dubbo.common.Pager;
import com.xq.live.dubbo.model.Shop;
import com.xq.live.dubbo.service.BaseSerivce;
import com.xq.live.dubbo.vo.ShopInVo;

/**
 * @package: com.xq.live.dubbo.api
 * @description: 商家接口定义
 * @author: zhangpeng32
 * @date: 2018/3/25 12:18
 * @version: 1.0
 */
public interface ShopApi extends BaseSerivce<Shop>{
    /**
     * 分页查询
     * @param shopInVo
     * @return
     */
    public BaseResp<Pager<Shop>> queryWithPg(ShopInVo shopInVo);
}
