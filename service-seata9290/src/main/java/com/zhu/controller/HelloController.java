package com.zhu.controller;

import com.zhu.service.OpenFeign;
import com.zhu.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

	@Resource
	private OrderService orderService;


	@RequestMapping("/hello")
	@GlobalTransactional
	public String hello(@RequestParam(value = "id",required = false)Long id){
		orderService.insert(id);//添加订单
		return "hello";
	}
}
