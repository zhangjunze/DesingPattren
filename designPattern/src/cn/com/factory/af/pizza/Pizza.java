package cn.com.factory.af.pizza;

public abstract class Pizza {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void bake(){
		System.out.println(name+"bakeing...");
	}
	
	public void cut(){
		System.out.println(name+"cutting...");
		
	}
	public void box(){
		System.out.println(name+"boxing...");
		
	}
	public abstract void prepare();
}
