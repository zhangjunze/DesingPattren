package cn.com.strategy.pattern.duck;

import cn.com.strategy.pattern.Duck;
import cn.com.strategy.pattern.fly.FlyWithWings;
import cn.com.strategy.pattern.quack.MuteQuack;

public class ReadHeadDuck extends Duck {
	 public ReadHeadDuck() {
		 super.flyBehavior = new FlyWithWings();
		 super.quackBehavior = new MuteQuack();
	}
	@Override
	public void display() {
		System.out.println("红头鸭");

	}

}
