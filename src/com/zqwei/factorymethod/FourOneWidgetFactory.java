package com.zqwei.factorymethod;

import com.zqwei.factorypattern.FourOneWidget;
import com.zqwei.factorypattern.Widget;

public class FourOneWidgetFactory implements WidgetFactory {

	public Widget createFactory() {
		return new FourOneWidget();
	}
}
