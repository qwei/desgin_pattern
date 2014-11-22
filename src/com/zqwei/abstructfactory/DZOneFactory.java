package com.zqwei.abstructfactory;

public class DZOneFactory extends DZFactory {

	public Lamp createDZLamp() {
		return new DZLamp();
	}

	public Wheel createDZWheel() {
		return new DZWheel();
	}
}
