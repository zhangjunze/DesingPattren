package cn.com.decorate.decorate;

import cn.com.decorate.coffeebar.Drink;

public class Decorator extends Drink{
	private Drink drink;
	public Decorator(Drink drink) {
		this.drink = drink;
	}

	@Override
	public float cost() {
		return super.getPrice()+drink.cost();
	}
	
	@Override
	public String getDiscription() {
		return super.getDiscription()+"-"+super.getPrice()+"&&"+drink.getDiscription();
	}

}
