package cn.com.observation.jv;

import java.util.Observable;

public class InternetWeather {
	public static void main(String[] args) {
		Observable ob = new WratherData();
		ob.addObserver(new CurrentConditions());
		ob.addObserver(new ForcastConditions());
		
		ob.notifyObservers(new Data(20,100,200));
	}
}
