package cn.com.factory.af.method;

import cn.com.factory.af.pizza.LDCheesePizza;
import cn.com.factory.af.pizza.LDPeperPizza;
import cn.com.factory.af.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		switch (orderType) {
		case "LDCheesePizza":
			pizza = new LDCheesePizza();
			break;
		case "LDPeperPizza":
			pizza = new LDPeperPizza();
			break;
		default:
			break;
		}
		return pizza;
	}

}
