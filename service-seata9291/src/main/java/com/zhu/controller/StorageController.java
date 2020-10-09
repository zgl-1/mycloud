/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.controller;

import com.zhu.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 朱桂林 create 2020/10/9 15:55
 */
@RestController
public class StorageController {

	@Resource
	private StorageService storageService;

	@RequestMapping("/storage/hello")
	public void storageHello(){
		storageService.decri(1);
	}
}
