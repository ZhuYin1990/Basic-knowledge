package com.zhuyin.testNull;

import org.junit.Test;

public class TestNullTest {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		NullTest myNullTest = null;
		System.out.println(myNullTest.getInt());
	}
	
	@Test
	public void test1(){
		int x=271;	
		int count=0;
		while(x>0){
			count++;
			System.out.println("before:"+x+"——"+Integer.toBinaryString(x));
			System.out.println("before:"+(x-1)+"——"+Integer.toBinaryString(x-1));
			x=x&(x-1);
			System.out.println("result:"+x+"——"+Integer.toBinaryString(x));
			System.out.println();
		}
		System.out.println(count);		//5
	}
	
	@Test
	public void test2(){
		System.out.println(Integer.toBinaryString(256));	// 1 0000 0000
		System.out.println(Integer.toBinaryString(255));	//   1111 1111
		System.out.println(256&255);
	}
	
}
