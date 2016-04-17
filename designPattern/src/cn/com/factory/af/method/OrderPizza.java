package cn.com.factory.af.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cn.com.factory.af.pizza.Pizza;

public abstract class OrderPizza {

	public OrderPizza() {
		Pizza pizza = createPizza(getType());
		if(pizza==null){
			System.out.println("没有这个类型的披萨结果。");
		}else{
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}
		
	}
	public abstract Pizza createPizza(String orderType);

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
