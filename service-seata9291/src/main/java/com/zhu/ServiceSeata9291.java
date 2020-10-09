package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceSeata9291 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceSeata9291.class,args);
	}
}
