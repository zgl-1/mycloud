/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.service;

import com.zhu.mapper.OrderMapper;
import com.zhu.model.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 朱桂林 create 2020/9/30 15:02
 */
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
