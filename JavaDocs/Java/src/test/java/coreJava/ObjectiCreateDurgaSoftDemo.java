package coreJava;
import java.lang.reflect.Constructor;
public class ObjectiCreateDurgaSoftDemo {
	
	void show1() {
		System.out.println("abc");
	}
	
	public static void main(String[]a) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		
		
		Object obj = Class.forName(a[0]).newInstance();
		
		System.out.println("Object created: "+obj.getClass().getName());
		
	}

}
