package cn.com.factory.af.absfactory;

import cn.com.factory.af.pizza.Pizza;

public interface AbsFactory {

	public Pizza createPizza(String orderType);
}
