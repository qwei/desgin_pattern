package com.zqwei.memento;

public class Originator {

	private Memento memento;
	
	private String name = null;
	
	public Originator(String name) {
		this.name = name;
	}

	public Memento createMemento() {
		return  new Memento(name);
	}
	public void restoreMemento(Memento memento) {
		this.name = memento.getName();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
