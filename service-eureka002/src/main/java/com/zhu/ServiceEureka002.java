/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 朱桂林 create 2020/9/9 15:39
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceEureka002 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceEureka002.class,args);
	}
}
