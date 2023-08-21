package coreJava;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;



public class ObjectCreation {

	public static void main(int[] a) {
		System.out.println("Applw");
	}

	public static void main(String[] a)
			throws CloneNotSupportedException, ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/***
		 * ObjectCreation obj1 = new ObjectCreation();
		 * 
		 * int arr[] = { 1, 3, 4 };
		 * 
		 * obj1.main(arr);
		 * 
		 * ObjectCreation obj2 = (ObjectCreation) obj1.clone();
		 * 
		 **/

		Class aa = Class.forName("coreJava.Aero");

		Constructor<?> con = aa.getDeclaredConstructor();
		//con.setAccessible(true);

		Aero ins = (Aero) con.newInstance();

		ins.show();
	}

}
