package com.zhu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-seata9292")
public interface AccountOpenFeign {
	@RequestMapping("/accountHello")
	public void accountMoney();
}
