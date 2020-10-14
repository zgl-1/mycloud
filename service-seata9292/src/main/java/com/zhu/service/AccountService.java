package com.zhu.service;

import com.zhu.mapper.AccountMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountService {
	@Resource
	private AccountMapper accountMapper;

	public void decriMoney(){
		accountMapper.decri();
//		int a =10/0;
	}
}
