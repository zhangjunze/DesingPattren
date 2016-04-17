package cn.com.factory.oo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cn.com.factory.oo.pizza.CheesePizza;
import cn.com.factory.oo.pizza.PeperPizza;
import cn.com.factory.oo.pizza.Pizza;

public  class OrderPizza {
	public OrderPizza() {
		Pizza pizza = null;

		switch (getType()) {
		case "PeperPizza":
			pizza = new PeperPizza();
			break;
		case "CheesePizza":
			pizza = new CheesePizza();
			break;

		default:
			break;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
	}

	private String getType() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("请选择Pizza类型：");
			return reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
