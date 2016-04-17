package cn.com.decorate.coffeebar;

import cn.com.decorate.coffee.Espresson;
import cn.com.decorate.decorate.Chocolate;
import cn.com.decorate.decorate.Minlk;

public class Coffeebar {
	public static void main(String[] args) {
		Drink d = new Espresson();
		d = new Minlk(d);
		d= new Chocolate(d);
		System.out.println(d.cost());
		System.out.println(d.getDiscription());
	}
}
