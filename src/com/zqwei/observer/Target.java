package com.zqwei.observer;

public interface Target {

	/*
	 * 一个目标有三个方法，跟Observer交互
	 */
	public void attach(MyObserver observer);
	
	public void detach(MyObserver observer);
	
	public void notifyChange();
}
