package coreJava;

public class StringBufferDemo {

	public static void main(String[]a) {
		
		StringBuffer sb = new StringBuffer("Vijay");
		System.out.println(sb.capacity());
		sb.append("Chaitanya");
		System.out.println(sb); 
		sb.deleteCharAt(4);
		String s = sb.toString();
		System.out.println(s);
		
		String s1 =sb.substring(3, 7);
		System.out.println(s1);
		
		
	}
}
