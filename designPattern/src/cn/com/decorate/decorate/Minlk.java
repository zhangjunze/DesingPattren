package cn.com.decorate.decorate;

import cn.com.decorate.coffeebar.Drink;

public class Minlk extends Decorator{

	public Minlk(Drink drink) {
		super(drink);
		super.setDiscription("Minkl");
		super.setPrice(1f);
	}
}
