package com.zhu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SERVICE-PROVIDER-HYSTRIX001", fallback = FeignFallbackService.class)
public interface FeignService {
	@GetMapping("/provider")
	public String provider();

	@GetMapping("/providerTimeOut")
	public String providerTimeOut();
}
