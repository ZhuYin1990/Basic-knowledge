package com.zhuyin.dynamicProxy.cglib.proxyChain;

import java.util.List;

import com.zhuyin.dynamicProxy.cglib.pxoyInterface.proxyInterface;

import net.sf.cglib.proxy.MethodProxy;

public class ProxyChain {
	
	private int index;
	private List<proxyInterface>functions;
	private Object target;
	private Object[] args;
	private MethodProxy methodProxy;
	
	public ProxyChain(List<proxyInterface> functions, Object object, Object[] args, MethodProxy methodProxy) {
		this.functions=functions;
		this.target=object;
		this.args=args;
		this.methodProxy=methodProxy;
	}

	public void doProxy(){
		if (index<functions.size()) {
			functions.get(index++).doProxy(this);
		}else {
			try {
				methodProxy.invokeSuper(target, args);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}
}
