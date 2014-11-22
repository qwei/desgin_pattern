package com.zqwei.factorypattern;

public class WidgetFactory {

	public static final String FOUR_ONE_TYPE = "4x1";
	public static final String FOUR_TWO_TYPE = "4X2";
	public static Widget createWidget(String type) {
		if(FOUR_ONE_TYPE.equals(type)) {
			return new FourOneWidget();
		} else if(FOUR_TWO_TYPE.equals(type)) {
			return new FourTwoWidget();
		}
		return null;
	}
}
