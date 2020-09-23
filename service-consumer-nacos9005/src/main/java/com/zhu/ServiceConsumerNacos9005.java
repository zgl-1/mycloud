/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 朱桂林 create 2020/9/17 9:48
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceConsumerNacos9005 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumerNacos9005.class,args);
	}
}
