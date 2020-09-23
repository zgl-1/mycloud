/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.controller;

import com.zhu.config.RestContextt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 朱桂林 create 2020/9/9 9:48
 */
@RestController
public class ConsumerController {
	@Value("${server.port}")
	private String port;

	private static final String URL = "http://SERVICE-PROVIDER";

	@Resource
	private RestContextt restContextt;

	@GetMapping("/consumer")
	public String provider() {
		return restContextt.getRestTemlate().getForObject(URL + "/provider", String.class);
	}
}
