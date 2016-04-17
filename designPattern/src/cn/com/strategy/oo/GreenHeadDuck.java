package cn.com.strategy.oo;

public class GreenHeadDuck extends Duck {

	@Override
	public void display() {
		System.out.println("========我是绿头鸭========");
	}
	
	@Override
	public void fly() {
		System.out.println("=====不会飞了。。。=====");
	}

}
