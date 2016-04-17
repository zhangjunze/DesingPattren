package cn.com.observation.weather;

import java.util.ArrayList;
import java.util.List;

public class WratherData implements Subject {
	private float temperature;
	private float pressure;
	private float humidity;
	List<Observer> observers;

	public WratherData() {
		observers = new ArrayList<Observer>();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void dataChange() {
		notifyObserver();
	}

	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		dataChange();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		if(observers.contains(o))
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(getTemperature(), getPressure(), getHumidity());
		}
	}

}
