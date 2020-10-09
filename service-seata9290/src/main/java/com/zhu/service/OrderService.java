package com.zhu.service;

import com.zhu.mapper.OrderMapper;
import com.zhu.model.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService {

	@Resource
	private OrderMapper orderMapper;

	public void insert(){
		Order order =new Order();
		order.setFlag(0);
		order.setName("订单");
		orderMapper.insert(order);
	}
	public void update(long id){
		Order order =new Order();
		order.setId(id);
		orderMapper.update(order);
	}
}
