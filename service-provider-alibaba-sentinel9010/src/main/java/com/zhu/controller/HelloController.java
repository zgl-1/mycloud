/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 朱桂林 create 2020/9/17 9:43
 */
@RestController
public class HelloController {
	@Value("${server.port}")
	public String serverPort;

	@RequestMapping("/hello")
	@SentinelResource(value = "hello", blockHandler = "getHelloblockHandler")
	public String getHello(){
		return serverPort;
	}

	public String getHelloblockHandler(BlockException e){
		return "发生限流了----------------";
	}

	@RequestMapping("/hot")
	@SentinelResource(value = "hot", blockHandler = "getHelloblockHandler")
	public String getHot(@RequestParam(value = "p1",required = false) String p1,
						 @RequestParam(value = "p2",required = false) String p2){
		return serverPort;
	}
}
