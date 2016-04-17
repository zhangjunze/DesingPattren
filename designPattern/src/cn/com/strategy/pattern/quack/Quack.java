package cn.com.strategy.pattern.quack;

public class Quack implements QuackBehavior{
	@Override
	public void quake() {
		System.out.println("鸭子嘎嘎叫");
		
	}
}
