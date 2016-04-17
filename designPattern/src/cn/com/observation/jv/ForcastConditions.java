package cn.com.observation.jv;

import java.util.Observable;
import java.util.Observer;

public class ForcastConditions implements Observer {
	
	public void display(Data arg){
		System.out.println("==========明天的温度" + arg.getTemperature());
		System.out.println("==========明天的气压" + arg.getPressure());
		System.out.println("==========明天的湿度" + arg.getHumidity());
	}

	@Override
	public void update(Observable o, Object arg) {
		display((Data)arg);
		
	}
}
