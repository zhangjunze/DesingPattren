package cn.com.observation.oo;

public class InternetWeather {
	public static void main(String[] args) {
		CurrentConditions currentConditions = new CurrentConditions();
		WratherData wratherData = new WratherData(currentConditions);
		wratherData.setData(30, 150, 40);
		
	}
}
