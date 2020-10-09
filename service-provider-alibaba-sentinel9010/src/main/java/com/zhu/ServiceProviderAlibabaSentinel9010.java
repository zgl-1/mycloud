package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceProviderAlibabaSentinel9010 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderAlibabaSentinel9010.class, args);
	}
}
