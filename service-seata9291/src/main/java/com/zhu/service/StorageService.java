package com.zhu.service;

import com.zhu.mapper.StorageMapper;
import com.zhu.model.Storage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
