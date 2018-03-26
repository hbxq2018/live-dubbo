package com.xq.live.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.xq.live.dubbo.common.BaseResp;
import com.xq.live.dubbo.model.Shop;
import com.xq.live.dubbo.service.ShopDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDubboConfiguration
public class DubboClientApplication {

	@Autowired
	private ShopDubboService shopDubboService;

	public static void main(String[] args) {
		SpringApplication.run(DubboClientApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello(){
		BaseResp<Shop> baseResp = shopDubboService.get(1L);
		return "hello "+ baseResp.getCode()+": NAME : "+baseResp.getData().getShopName();
	}
}
