package com.zhu.mapper;

import com.zhu.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
	public void insert(Order order);
	public void update(Order order);
}
