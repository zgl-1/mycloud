/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.controller;

import com.zhu.config.RestContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 朱桂林 create 2020/9/17 9:49
 */
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
