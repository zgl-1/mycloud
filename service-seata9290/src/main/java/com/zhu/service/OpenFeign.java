/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 朱桂林 create 2020/10/9 16:21
 */
@Component
@FeignClient(value = "service-seata9291")
public interface OpenFeign {
	@RequestMapping("/storage/hello")
	public void storageHello();
}
