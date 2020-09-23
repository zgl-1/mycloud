/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 朱桂林 create 2020/9/10 16:46
 */
@Component
@FeignClient(value = "SERVICE-PROVIDER")
public interface FeignService {
	@GetMapping("/provider")
	public String provider();

	@GetMapping("/provider001")
	public String provider001();
}
