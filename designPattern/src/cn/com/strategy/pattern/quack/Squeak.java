package cn.com.strategy.pattern.quack;

public class Squeak implements QuackBehavior {

	@Override
	public void quake() {
		System.out.println("鸭子吱吱叫");
		
	}

}
