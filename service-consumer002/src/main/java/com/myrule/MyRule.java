/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 朱桂林 create 2020/9/10 16:07
 */
@Configuration
public class MyRule {
	@Bean
	public IRule mySelfRule(){
		return new RandomRule();//修改成随机的策略
	}
}
