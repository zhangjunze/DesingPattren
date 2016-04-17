package cn.com.factory.af.absfactory;

import cn.com.factory.af.pizza.NYCheesePizza;
import cn.com.factory.af.pizza.NYPeperPizza;
import cn.com.factory.af.pizza.Pizza;

public class NYOrderPizza implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		switch (orderType) {
		case "NYCheesePizza":
			pizza = new NYCheesePizza();
			break;
		case "NYPeperPizza":
			pizza = new NYPeperPizza();
			break;
		default:
			break;
		}
		return pizza;
	}

}
