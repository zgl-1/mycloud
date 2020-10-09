package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceConsumerNacos9005 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumerNacos9005.class,args);
	}
}
