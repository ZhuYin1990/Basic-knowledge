package com.zhuyin.designMode.factoryPattern.factoryMethod;

public class BenzDriver implements Driver {

	public Car driveCar() {
		return new Benz();
	}

}
