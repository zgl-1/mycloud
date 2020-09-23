/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 朱桂林 create 2020/9/9 9:50
 */
@Configuration
public class RestContextt {
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemlate(){
		return new RestTemplate();
	}
}
