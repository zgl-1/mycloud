package com.zhu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "service-seata9291")
public interface OpenFeign {
	@RequestMapping("/storage/hello")
	public void storageHello();
}
