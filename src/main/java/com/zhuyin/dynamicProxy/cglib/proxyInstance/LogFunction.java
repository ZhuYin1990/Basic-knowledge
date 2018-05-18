package com.zhuyin.dynamicProxy.cglib.proxyInstance;

import com.zhuyin.dynamicProxy.cglib.proxyChain.ProxyChain;
import com.zhuyin.dynamicProxy.cglib.pxoyInterface.proxyInterface;

public class LogFunction implements proxyInterface {

	public void doProxy(ProxyChain proxyChain) {
		System.out.println("日志记录功能开始...");
		proxyChain.doProxy();
		System.out.println("日志记录功能结束...");
	}

}
