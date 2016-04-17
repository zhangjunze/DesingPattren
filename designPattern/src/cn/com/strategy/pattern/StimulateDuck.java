package cn.com.strategy.pattern;

import cn.com.strategy.pattern.duck.GreenHeadDuck;
import cn.com.strategy.pattern.duck.ReadHeadDuck;
/**
 * 策略模式
 * @author Administrator
 *
 */
public class StimulateDuck {
	public static void main(String[] args) {
		GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
		
		ReadHeadDuck readHeadDuck = new ReadHeadDuck();
		
		greenHeadDuck.display();
		greenHeadDuck.quack();
		greenHeadDuck.fly();
		
		readHeadDuck.display();
		readHeadDuck.quack();
		readHeadDuck.fly();
	}
}
