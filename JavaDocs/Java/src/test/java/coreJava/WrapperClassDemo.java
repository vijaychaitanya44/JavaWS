package coreJava;

public class WrapperClassDemo {

	public static void main(String[] a) {

		int num = 7;

		// Integer num1 = new Integer(8);
		// Integer num1 = 8;
		//Integer num1 = new Integer(num); //- Boxing
		
		Integer num1 = num; //autoboxing
		System.out.println(num1);
		
		//int num2 = num1.intValue(); // unboxing
		int num2 = num1; //AutoUnboxing
		
		System.out.println(num2);
		
		
		String str = "12";
		
		int num3 = Integer.parseInt(str);
		
		System.out.println(num3*2);

	}

}
