package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceConfigClient8689 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceConfigClient8689.class,args);
	}
}
