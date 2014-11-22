package com.zqwei.observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Target{

	private List<MyObserver> observers;
	private String phoneNumber;
	
	public Teacher(String phoneNumber){
		observers = new ArrayList<MyObserver>();
		this.phoneNumber = phoneNumber;
	}
	public void attach(MyObserver observer) {
		observers.add(observer);
	}

	public void detach(MyObserver observer) {
		observers.remove(observer);
	}

	public void notifyChange() {
		for(MyObserver observer:observers) {
			observer.update();
		}
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		notifyChange();
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}


