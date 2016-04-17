package cn.com.strategy.oo;

public abstract class Duck {

	//叫
	public void quack(){
		System.out.println("=======gaga=====");
	}
	
	public abstract void display();
	
	public void swin(){
		System.out.println("========I'm swin");
	}
	
	public void fly(){
		System.out.println("========我要飞的更高=========");
	}
}
