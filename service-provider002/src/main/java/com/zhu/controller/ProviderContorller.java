/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author 朱桂林 create 2020/9/9 9:23
 */
@RestController
public class ProviderContorller {
	@Value("${server.port}")
	private String port;

	@GetMapping("/provider")
	public String provider() {
		return "这里是provider，port：" + port + "," + UUID.randomUUID();
	}

	@GetMapping("/provider001")
	public String provider001() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "这里是provider，port：" + port + "," + UUID.randomUUID();
	}
}
