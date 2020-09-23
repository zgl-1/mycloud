/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 朱桂林 create 2020/9/9 9:20
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceProvider001 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceProvider001.class,args);
	}
}
