package com.zqwei.memento;

public class CareTaker {
	private Memento memento;
	
	public CareTaker(Memento memento) {
		this.memento = memento;
	}
	
	public Memento getMemento(){
		return memento;
	}
}
