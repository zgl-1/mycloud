/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.controller;

import com.zhu.service.HystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author 朱桂林 create 2020/9/11 14:35
 */
@RestController
public class HystrixController {
	@Resource
	private HystrixService hystrixService;

	@GetMapping("/provider")
	public String provider() {
		return hystrixService.providerHystrix();
	}

	@GetMapping("/providerTimeOut")
	public String providerTimeOut() {
		return hystrixService.providerHystrixTimeOut();
	}
}
