package cn.com.strategy.pattern;

import cn.com.strategy.pattern.fly.FlyBehavior;
import cn.com.strategy.pattern.quack.QuackBehavior;

public abstract class Duck {
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void fly(){
		flyBehavior.fly();
	}
	
	public void quack(){
		quackBehavior.quake();
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}
	
	public void setFlyBrhavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
}
