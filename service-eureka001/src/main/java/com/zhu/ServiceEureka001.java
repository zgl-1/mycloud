/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 朱桂林 create 2020/9/9 10:20
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceEureka001 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceEureka001.class,args);
	}
}
