/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.zhu.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author 朱桂林 create 2020/9/15 15:24
 */
@Component
@Slf4j
public class CustomGlobalFilter implements GlobalFilter, Ordered {
	@Override public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		log.info("hello!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		String id = exchange.getRequest().getQueryParams().getFirst("id");
		if (id==null){
			log.info("请求失败!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
			return exchange.getResponse().setComplete();
		}
		return chain.filter(exchange);
	}

	@Override public int getOrder() {
		return 0;
	}
}
