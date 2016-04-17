package cn.com.strategy.oo;

public class StimulateDuck {
	public static void main(String[] args) {
		GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
		
		ReadHeadDuck readHeadDuck = new ReadHeadDuck();
		
		greenHeadDuck.display();
		greenHeadDuck.quack();
		greenHeadDuck.swin();
		greenHeadDuck.fly();
		
		readHeadDuck.display();
		readHeadDuck.quack();
		readHeadDuck.swin();
		readHeadDuck.fly();
	}
}
