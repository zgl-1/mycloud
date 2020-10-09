package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServiceConsumerOpenfeign001 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumerOpenfeign001.class,args);
	}
}
