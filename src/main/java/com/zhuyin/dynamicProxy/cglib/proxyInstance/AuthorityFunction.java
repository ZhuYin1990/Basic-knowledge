package com.zhuyin.dynamicProxy.cglib.proxyInstance;

import com.zhuyin.dynamicProxy.cglib.proxyChain.ProxyChain;
import com.zhuyin.dynamicProxy.cglib.pxoyInterface.proxyInterface;

public class AuthorityFunction implements proxyInterface{

	public void doProxy(ProxyChain proxyChain) {
		System.out.println("权限校验功能开始...");
		proxyChain.doProxy();
		System.out.println("权限校验功能结束...");
	}

}
