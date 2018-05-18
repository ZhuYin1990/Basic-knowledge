package com.zhuyin.dynamicProxy.cglib.proxyManager;

import java.lang.reflect.Method;
import java.util.List;

import com.zhuyin.dynamicProxy.cglib.proxyChain.ProxyChain;
import com.zhuyin.dynamicProxy.cglib.pxoyInterface.proxyInterface;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyManager {
	
	private Class<?> targetClass;
	private List<proxyInterface> functions;
	
	public ProxyManager(Class<?> targetClass, List<proxyInterface> functions) {
		this.targetClass = targetClass;
		this.functions = functions;
	}
	
	public Object newProxyInstance(){
		
		return Enhancer.create(targetClass, new MethodInterceptor() {
			
			public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				ProxyChain proxyChain=new ProxyChain(functions,object,args,methodProxy);
				proxyChain.doProxy();
				return null;
			}
		});
	}
	
	
	
}
