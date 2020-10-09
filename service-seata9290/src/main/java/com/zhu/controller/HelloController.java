package com.zhu.controller;

import com.zhu.service.OpenFeign;
import com.zhu.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

	@Resource
	private OrderService orderService;

	@Resource
	private OpenFeign openFeign;

	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "id",required = false)Long id){
		orderService.insert();//添加订单
		openFeign.storageHello();//减少库存，每次减1
		orderService.update(id);//更改订单状态
		return "hello";
	}
}
