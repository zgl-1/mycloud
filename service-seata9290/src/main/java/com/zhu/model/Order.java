/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.model;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 朱桂林 create 2020/9/30 14:58
 */
@Data
public class Order {
	private long id;
	private int flag;
	private String name;
}
