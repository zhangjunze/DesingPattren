package cn.com.factory.af.pizza;

public class NYPeperPizza extends Pizza {

	@Override
	public void prepare() {
		super.setName("NYPeperPizza");
		System.out.println(super.getName()+"准备材料。。。");
	}

}
