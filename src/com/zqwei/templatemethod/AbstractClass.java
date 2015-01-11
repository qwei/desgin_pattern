package com.zqwei.templatemethod;

public abstract class AbstractClass {
	public void buildFourTwoWidget() {
		setBackground();
		setFontColor();
	}
	
	public abstract void setBackground();
	
	public abstract void setFontColor();
}


