package com.zhu.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogLevelConfig {
	@Bean
	Logger.Level myLevel(){
		return Logger.Level.FULL;
	}
}
