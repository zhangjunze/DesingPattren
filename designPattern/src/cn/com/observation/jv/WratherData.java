package cn.com.observation.jv;

import java.util.Observable;

public class WratherData extends Observable {
	public WratherData() {
		setChanged();
	}
}
class Data{
	public Data(float temperature,float pressure,float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
	}
	
	private float temperature;
	private float pressure;
	private float humidity;
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
}