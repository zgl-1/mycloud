package com.zhu.controller;

import com.zhu.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {

	@Resource
	private StorageService storageService;

	@RequestMapping("/storage/hello")
	public void storageHello() {
		storageService.decri(1);
	}
}
