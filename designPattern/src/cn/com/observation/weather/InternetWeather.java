package cn.com.observation.weather;

public class InternetWeather {
	public static void main(String[] args) {
		CurrentConditions currentConditions = new CurrentConditions();
		ForcastConditions forcastConditions = new ForcastConditions();
		WratherData wratherData = new WratherData();
		wratherData.registerObserver(currentConditions);
		wratherData.registerObserver(forcastConditions);
		
		wratherData.setData(100, 200, 100);
	}
}
