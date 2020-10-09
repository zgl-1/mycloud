package com.zhu.controller;

import com.zhu.service.HystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

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
