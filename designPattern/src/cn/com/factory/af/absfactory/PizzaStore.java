package cn.com.factory.af.absfactory;

public class PizzaStore {
	public static void main(String[] args) {
		new OrderPizza(new LDOrderPizza());
		
	}
}
