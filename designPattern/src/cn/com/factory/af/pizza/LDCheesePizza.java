package cn.com.factory.af.pizza;

public class LDCheesePizza extends Pizza{

	@Override
	public void prepare() {
		super.setName("LDCheesePizza");
		System.out.println(super.getName()+"准备材料。。。");
	}

}
