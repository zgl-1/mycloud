/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu;

import com.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * @author 朱桂林 create 2020/9/9 9:05
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SERVICE-PROVIDER", configuration = MyRule.class)
public class ServiceConsumer002 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumer002.class,args);
	}
}
