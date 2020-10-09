package com.zhu.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.UUID;

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
