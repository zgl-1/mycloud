package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceProviderNacos9001 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderNacos9001.class,args);
	}
}
