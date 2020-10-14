package com.zhu.controller;

import com.zhu.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AccountController {
	@Resource
	private AccountService accountService;

	@RequestMapping("/accountHello")
	public void accountMoney() {
		accountService.decriMoney();
	}
}
