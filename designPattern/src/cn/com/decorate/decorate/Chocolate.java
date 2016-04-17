package cn.com.decorate.decorate;

import cn.com.decorate.coffeebar.Drink;

public class Chocolate extends Decorator{

	public Chocolate(Drink drink) {
		super(drink);
		super.setDiscription("Chocolate");
		super.setPrice(3f);
	}
}
