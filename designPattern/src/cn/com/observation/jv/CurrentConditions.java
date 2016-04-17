package cn.com.observation.jv;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditions implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Data d = (Data) arg;
		display(d);
	}
	
	public void  display(Data d){
		System.out.println("==========今天的温度" + d.getTemperature());
		System.out.println("==========今天的气压" + d.getPressure());
		System.out.println("==========今天的湿度" + d.getHumidity());
	}

}
