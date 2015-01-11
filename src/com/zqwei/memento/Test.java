package com.zqwei.memento;

public class Test {

	public static void main(String[] args) {
		Originator ori = new Originator("zhangsan");
		CareTaker careTaker = new CareTaker(ori.createMemento());
		
		System.out.println("before modify, name is "+ori.getName());
		ori.setName("lisi");
		System.out.println("after modify,name is "+ori.getName());
		ori.restoreMemento(careTaker.getMemento());
		System.out.println("after restore, name is"+ori.getName());
	}
}
