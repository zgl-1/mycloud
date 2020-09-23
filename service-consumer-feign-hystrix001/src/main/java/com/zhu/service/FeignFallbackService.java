/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.service;

import org.springframework.stereotype.Component;

/**
 * @author 朱桂林 create 2020/9/14 15:27
 */
@Component
public class FeignFallbackService implements FeignService{
	public String provider() {
		return "fallback";
	}

	public String providerTimeOut() {
		return "fallback";
	}
}
