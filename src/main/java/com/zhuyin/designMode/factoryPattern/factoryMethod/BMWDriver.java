package com.zhuyin.designMode.factoryPattern.factoryMethod;

public class BMWDriver implements Driver {

	public Car driveCar() {
		return new Bmw();
	}

}
