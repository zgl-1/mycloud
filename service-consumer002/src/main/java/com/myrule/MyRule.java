package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {
	@Bean
	public IRule mySelfRule(){
		return new RandomRule();//修改成随机的策略
	}
}
