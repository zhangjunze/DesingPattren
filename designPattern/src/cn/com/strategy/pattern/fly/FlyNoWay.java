package cn.com.strategy.pattern.fly;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("======不会飞行========");
	}

}
