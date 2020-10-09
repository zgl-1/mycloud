/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.service;

import com.zhu.mapper.StorageMapper;
import com.zhu.model.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 朱桂林 create 2020/10/9 15:57
 */
@Service
public class StorageService {

	@Resource
	private StorageMapper storageMapper;

	public void decri(int num) {
		Storage storage=new Storage();
		storage.setId(1L);
		storageMapper.decri(storage);
	}
}
