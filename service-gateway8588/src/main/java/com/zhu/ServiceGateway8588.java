/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.time.ZonedDateTime;

/**
 * @author 朱桂林 create 2020/9/15 9:50
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceGateway8588 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceGateway8588.class,args);
	}
}
