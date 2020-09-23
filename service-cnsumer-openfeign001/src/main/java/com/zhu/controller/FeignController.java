/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.controller;

import com.zhu.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 朱桂林 create 2020/9/10 16:49
 */
@RestController
public class FeignController {
	@Resource
	public FeignService feignService;

	@GetMapping("/consumer/feign")
	public String provider(){
		return feignService.provider();
	}

	@GetMapping("/consumer/feign001")
	public String provider001(){
		return feignService.provider001();
	}
}
