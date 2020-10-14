package com.zhu;

import com.alibaba.cloud.seata.feign.SeataFeignClientAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceSeata9291 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceSeata9291.class,args);
	}
}
