package com.zhu;

import com.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SERVICE-PROVIDER", configuration = MyRule.class)
public class ServiceConsumer002 {
	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumer002.class,args);
	}
}
