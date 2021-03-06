package com.zhu;

import com.alibaba.cloud.seata.feign.SeataFeignClientAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = { SeataFeignClientAutoConfiguration.class})
@EnableFeignClients
@EnableDiscoveryClient
public class ServiceSeata9290 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceSeata9290.class,args);
	}
}
