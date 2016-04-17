package cn.com.factory.oo.pizza;

public class PeperPizza extends Pizza {

	@Override
	public void prepare() {
		super.setName("PeperPizza");
		System.out.println(super.getName()+"PeperPizza");
	}

}
