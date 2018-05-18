package com.zhuyin.dynamicProxy.cglib.client;

import java.util.ArrayList;
import java.util.List;

import com.zhuyin.dynamicProxy.cglib.proxyInstance.AuthorityFunction;
import com.zhuyin.dynamicProxy.cglib.proxyInstance.LogFunction;
import com.zhuyin.dynamicProxy.cglib.proxyManager.ProxyManager;
import com.zhuyin.dynamicProxy.cglib.pxoyInterface.proxyInterface;
import com.zhuyin.dynamicProxy.cglib.targetObj.UserService;

public class Client {

	public static void main(String[] args) {
		List<proxyInterface>functions=new ArrayList<proxyInterface>();
		functions.add(new AuthorityFunction());	//增加权限校验功能
		functions.add(new LogFunction());	//增加日志记录功能
		
		ProxyManager proxyManager=new ProxyManager(UserService.class, functions);
		UserService userService = (UserService) proxyManager.newProxyInstance();
		userService.service();
	}

}
