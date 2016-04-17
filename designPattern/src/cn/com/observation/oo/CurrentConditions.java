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
		System.out.println("==========������¶�" + this.temperature);
		System.out.println("==========�������ѹ" + this.pressure);
		System.out.println("==========�����ʪ��" + this.humidity);
	}
}
