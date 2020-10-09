/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.mapper;

import com.zhu.model.Storage;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 朱桂林 create 2020/10/9 16:00
 */
@Mapper
public interface StorageMapper {
	void decri(Storage storage);
}
