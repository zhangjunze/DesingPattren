package cn.com.factory.af.method;

import cn.com.factory.af.pizza.NYCheesePizza;
import cn.com.factory.af.pizza.NYPeperPizza;
import cn.com.factory.af.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

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
