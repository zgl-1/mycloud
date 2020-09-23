/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 朱桂林 create 2020/9/11 15:21
 */
@FeignClient(value = "SERVICE-PROVIDER-HYSTRIX001", fallback = FeignFallbackService.class)
public interface FeignService {
	@GetMapping("/provider")
	public String provider();

	@GetMapping("/providerTimeOut")
	public String providerTimeOut();
}
