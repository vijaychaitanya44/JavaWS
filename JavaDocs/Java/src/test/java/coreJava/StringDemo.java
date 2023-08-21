package coreJava;

public class StringDemo {

	public static void main(String []a) {
		
		String s = "Apple";
		
		String s1 = new String("Apple");
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		s= s+"pen";
		System.out.println(s);
		
	}
}
