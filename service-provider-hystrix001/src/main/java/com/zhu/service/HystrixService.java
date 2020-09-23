/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author 朱桂林 create 2020/9/11 14:27
 */
@Service
public class HystrixService {
	/**
	 * 正常访问
	 * @return
	 */
	public String providerHystrix(){
		return "线程：" + Thread.currentThread().getName() + "正常访问" + UUID.randomUUID();
	}

	/**
	 * 超时或者异常
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "providerHystrixTimeOutFallback",commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
	})
	public String providerHystrixTimeOut(){
		try {
			//int i=10/0;
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "线程：" + Thread.currentThread().getName()  + "超时访问" + UUID.randomUUID();
	}

	public String providerHystrixTimeOutFallback(){
		return "线程：" + Thread.currentThread().getName()  + "超时访问降级处理" + UUID.randomUUID();
	}

	//服务熔断


}
