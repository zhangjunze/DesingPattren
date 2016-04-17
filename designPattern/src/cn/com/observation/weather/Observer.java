package cn.com.observation.weather;

public interface Observer {
	public void update(float temperature, float pressure, float humidity);
}
