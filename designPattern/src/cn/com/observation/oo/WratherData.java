package cn.com.observation.oo;

public class WratherData {
	private float temperature;
	private float pressure;
	private float humidity;
	private CurrentConditions currentConditions;

	public WratherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
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
		currentConditions.update(getTemperature(), getPressure(), getHumidity());
	}
	
	public void setData(float temperature, float pressure, float humidity){
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		dataChange();
	}
}
