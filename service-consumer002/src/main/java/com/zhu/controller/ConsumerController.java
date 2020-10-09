package com.zhu.controller;

import com.zhu.config.RestContextt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
	@Value("${server.port}")
	private String port;

	private static final String URL = "http://SERVICE-PROVIDER";

	@Resource
	private RestContextt restContextt;

	@GetMapping("/consumer002")
	public String provider() {
		return restContextt.getRestTemlate().getForObject(URL + "/provider", String.class);
	}
}
