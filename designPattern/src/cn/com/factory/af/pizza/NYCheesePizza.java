package cn.com.factory.af.pizza;

public class NYCheesePizza extends Pizza{

	@Override
	public void prepare() {
		super.setName("NYCheesePizza");
		System.out.println(super.getName()+"准备材料。。。");
	}

}
