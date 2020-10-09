package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.time.ZonedDateTime;

@SpringBootApplication
@EnableEurekaClient
public class ServiceGateway8588 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceGateway8588.class,args);
	}
}
