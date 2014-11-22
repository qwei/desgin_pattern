package com.zqwei.factorymethod;

import com.zqwei.factorypattern.FourTwoWidget;
import com.zqwei.factorypattern.Widget;

public class FourTwoWidgetFactory implements WidgetFactory {

	public Widget createFactory() {
		return new FourTwoWidget();
	}
}
