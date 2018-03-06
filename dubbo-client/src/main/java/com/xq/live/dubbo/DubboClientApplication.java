package com.xq.live.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xq.live.dubbo.api.UserService;
import com.xq.live.dubbo.model.User;
import com.xq.live.dubbo.service.UserDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DubboClientApplication {

	@Autowired
	private UserDubboService userDubboService;

	public static void main(String[] args) {
		SpringApplication.run(DubboClientApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello(){
		User user = userDubboService.getUserByName("fuck");
		return "hello "+ user.getUserName();
	}
}
