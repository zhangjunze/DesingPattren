package cn.com.factory.af.absfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cn.com.factory.af.pizza.Pizza;

public class OrderPizza {

	public OrderPizza(AbsFactory absFactory) {
		Pizza pizza = absFactory.createPizza(getType());
		if(pizza==null){
			System.out.println("没有这个类型的披萨结果。");
		}else{
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}
		
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
