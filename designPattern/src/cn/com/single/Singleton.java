package cn.com.single;
/**
 * 单例模式:确保一个类最多只有一个实例，并提供一个全局访问点。
 * @author zhangJunze
 *
 */
public class Singleton {
	private static Singleton instance = null;
	private Singleton(){}
	
	public static Singleton newInstance(){
		if(instance==null)
			synchronized (Singleton.class) {
				if(instance==null)
					instance = new Singleton();
			}
		return instance;
	}
	
}
