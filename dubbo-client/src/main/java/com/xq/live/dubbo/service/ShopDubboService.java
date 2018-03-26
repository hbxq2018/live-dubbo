package com.xq.live.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xq.live.dubbo.api.ShopApi;
import com.xq.live.dubbo.common.BaseResp;
import com.xq.live.dubbo.model.Shop;
import org.springframework.stereotype.Component;

/**
 * @package: com.xq.live.dubbo.service
 * @description: TODO
 * @author: zhangpeng32
 * @date: 2018/3/25 12:58
 * @version: 1.0
 */
@Component
public class ShopDubboService {

    @Reference
    private ShopApi shopApi;

    public BaseResp<Shop> get(Long id){
        return shopApi.get(id);
    }
}
