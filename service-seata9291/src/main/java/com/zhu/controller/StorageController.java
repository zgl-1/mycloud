package com.zhu.controller;

import com.zhu.service.AccountOpenFeign;
import com.zhu.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {

	@Resource
	private StorageService storageService;

	@Resource
	private AccountOpenFeign accountOpenFeign;

	@RequestMapping("/storage/hello")
	public void storageHello() {
		storageService.decri(1);//减少库存
//		accountOpenFeign.accountMoney();//扣钱
	}
}
