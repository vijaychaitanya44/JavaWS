package com.qa.rest.POJODeserilzation;

public class PojoDemo {

	
	public static void main(String[]args) {
		
		Message m = new Message();
		
		m.setMessage("Hello");
		m.setGreet("Heeeee");
		
	
		System.out.println(m.getMessage()+" "+m.getGreet());
		
		
	}
}
