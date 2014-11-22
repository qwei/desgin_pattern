package com.zqwei.abstructfactory;

public class BMOneFactory extends BMFactory {

	public Wheel createBMWhell() {
		return new BMWheel();
	}

	public Lamp createBMLamp() {
		return new BMLamp();
	}

}
