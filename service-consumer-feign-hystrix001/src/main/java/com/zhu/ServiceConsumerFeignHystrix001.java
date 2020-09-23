/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 朱桂林 create 2020/9/11 15:18
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
public class ServiceConsumerFeignHystrix001 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumerFeignHystrix001.class,args);
	}
}
