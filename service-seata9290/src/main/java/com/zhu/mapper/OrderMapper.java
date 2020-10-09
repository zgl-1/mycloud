/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.mapper;

import com.zhu.model.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 朱桂林 create 2020/9/30 15:05
 */
@Mapper
public interface OrderMapper {
	public void insert(Order order);
	public void update(Order order);
}
