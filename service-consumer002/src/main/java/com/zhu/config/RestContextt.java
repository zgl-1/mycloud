package com.zhu.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestContextt {
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemlate(){
		return new RestTemplate();
	}
}
