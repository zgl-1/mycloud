/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 朱桂林 create 2020/10/9 15:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceSeata9291 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceSeata9291.class,args);
	}
}
