/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 朱桂林 create 2020/9/10 17:15
 */
@Configuration
public class LogLevelConfig {
	@Bean
	Logger.Level myLevel(){
		return Logger.Level.FULL;
	}
}
