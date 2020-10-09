package com.zhu.controller;

import com.zhu.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
