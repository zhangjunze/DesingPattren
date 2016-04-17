package cn.com.factory.oo.pizza;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		super.setName("CheesePizza");
		System.out.println(super.getName()+"== CheesePizza");
	}

}
