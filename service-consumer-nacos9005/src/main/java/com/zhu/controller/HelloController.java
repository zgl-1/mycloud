package com.zhu.controller;

import com.zhu.config.RestContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RefreshScope
public class HelloController {
	@Resource
	public RestContext restContext;

	@Value("${nacos.version}")
	public String version;

	@GetMapping("/consumer/hello")
	public String get() {
		return restContext.getRestTemplate().getForObject("http://service-provider-nacos/hello", String.class);
	}

	@GetMapping("/consumer/nacos")
	public String nacos(){
		return version;
	}

}
