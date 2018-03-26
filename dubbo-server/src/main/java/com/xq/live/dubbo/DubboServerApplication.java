package com.xq.live.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// mapper 接口类扫描包配置
@MapperScan("com.xq.live.dubbo.dao")
@EnableDubboConfiguration
@SpringBootApplication
public class DubboServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboServerApplication.class, args);
    }
}
