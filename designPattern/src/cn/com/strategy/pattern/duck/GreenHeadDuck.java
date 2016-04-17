package cn.com.strategy.pattern.duck;

import cn.com.strategy.pattern.Duck;
import cn.com.strategy.pattern.fly.FlyWithWings;
import cn.com.strategy.pattern.quack.Quack;

public class GreenHeadDuck extends Duck {
	public GreenHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("绿头鸭，可以飞行，嘎嘎叫");
	}

}
