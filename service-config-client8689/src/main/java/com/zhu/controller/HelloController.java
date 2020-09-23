/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 朱桂林 create 2020/9/15 16:59
 */
@RestController
@RefreshScope
public class HelloController {
	@Value("${servernameversion}")
	public String servernameversion;

	@RequestMapping("/hello")
	public String get(){
		return servernameversion;
	}
}
