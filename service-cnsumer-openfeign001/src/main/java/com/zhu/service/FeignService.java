package com.zhu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "SERVICE-PROVIDER")
public interface FeignService {
	@GetMapping("/provider")
	public String provider();

	@GetMapping("/provider001")
	public String provider001();
}
