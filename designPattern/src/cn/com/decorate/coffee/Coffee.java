package cn.com.decorate.coffee;

import cn.com.decorate.coffeebar.Drink;

public class Coffee extends Drink {

	@Override
	public float cost() {
		return super.getPrice();
	}

}
