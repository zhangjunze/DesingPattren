package cn.com.strategy.pattern.quack;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quake() {
		System.out.println("不会叫");
	}

}
