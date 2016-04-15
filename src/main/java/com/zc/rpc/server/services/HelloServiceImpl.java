package com.zc.rpc.server.services;

import com.zc.rpc.component.services.HelloService;
import com.zc.rpc.server.annotations.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		return "Hello" + name;
	}

}
