package cn.com.factory.af.pizza;

public class LDPeperPizza extends Pizza {

	@Override
	public void prepare() {
		super.setName("LDPeperPizza");
		System.out.println(super.getName()+"准备材料。。。");
	}

}
