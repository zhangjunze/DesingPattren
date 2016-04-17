package cn.com.decorate.coffeebar;

public abstract class Drink {
	private String discription;
	private float price;

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public abstract float cost();
}
