package com.zhu.service;

import org.springframework.stereotype.Component;

@Component
public class FeignFallbackService implements FeignService{
	public String provider() {
		return "fallback";
	}

	public String providerTimeOut() {
		return "fallback";
	}
}
