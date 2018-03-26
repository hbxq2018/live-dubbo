package com.xq.live.dubbo.handler;

import com.alibaba.dubbo.config.annotation.Service;
import com.xq.live.dubbo.api.ShopApi;
import com.xq.live.dubbo.common.BaseResp;
import com.xq.live.dubbo.common.Pager;
import com.xq.live.dubbo.common.ResultEnums;
import com.xq.live.dubbo.dao.ShopDao;
import com.xq.live.dubbo.model.Shop;
import com.xq.live.dubbo.vo.ShopInVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @package: com.xq.live.dubbo.handler
 * @description: 商家dubbo服务实现类
 * @author: zhangpeng32
 * @date: 2018/3/25 12:40
 * @version: 1.0
 */
@Service(interfaceClass = ShopApi.class)
@Component
public class ShopHandler implements ShopApi {

    @Autowired
    private ShopDao shopDao;

    @Override
    public BaseResp<Long> create(Shop shop) {
        return null;
    }

    @Override
    public BaseResp<Integer> delete(Long pk) {
        return null;
    }

    @Override
    public BaseResp<Integer> update(Shop shop) {
        return null;
    }

    @Override
    public BaseResp<Shop> get(Long pk) {
        Shop shop = shopDao.selectByPrimaryKey(pk);
        return new BaseResp<Shop>(ResultEnums.SUCCESS, shop);
    }

    @Override
    public BaseResp<Pager<Shop>> queryWithPg(ShopInVo shopInVo) {
        return null;
    }
}
