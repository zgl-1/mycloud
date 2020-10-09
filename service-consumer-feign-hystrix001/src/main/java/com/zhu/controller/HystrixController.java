package com.zhu.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zhu.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@DefaultProperties(defaultFallback = "providerTimeOutDefaultFallbackMethod")
public class HystrixController {
	@Resource
	private FeignService feignService;

	@GetMapping("/consumer/provider")
	public String provider(){
		return feignService.provider();
	}

	@HystrixCommand(fallbackMethod = "providerTimeOutFallbackMethod", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1300")
	})
	@GetMapping("/consumer/providerTimeOut")
	public String providerTimeOut(){
		return feignService.providerTimeOut();
	}


	public String providerTimeOutFallbackMethod() {
		return "调用方自己处理超时后的默认方法";
	}


	@GetMapping("/consumer/providerGlobal")
	@HystrixCommand
	public String providerGlobal(){
		return feignService.providerTimeOut();
	}
	//全局的默认处理方法
	public String providerTimeOutDefaultFallbackMethod() {
		return "调用方自己处理的全局的默认处理方法";
	}
}
