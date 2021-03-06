package cn.com.observation.oo;

public class CurrentConditions {
	private float temperature;
	private float pressure;
	private float humidity;

	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("==========今天的温度" + this.temperature);
		System.out.println("==========今天的气压" + this.pressure);
		System.out.println("==========今天的湿度" + this.humidity);
	}
}
