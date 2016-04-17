package cn.com.observation.weather;

public class ForcastConditions implements Observer {
	private float temperature;
	private float pressure;
	private float humidity;
	@Override
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}
	public void display(){
		System.out.println("==========明天的温度" + this.temperature);
		System.out.println("==========明天的气压" + this.pressure);
		System.out.println("==========明天的湿度" + this.humidity);
	}
}
