package com.practice.program;

public class StringSwap {

	public static void main(String[] args) {
		
		String first = "Vijay";
		String last = "Chaitanya";
		
		System.out.println("Before Swap: " +first+last);
		
		
		 first = first+last;
		 
		 last =first.substring(0,first.length()-last.length());
		 first=first.substring(last.length(),first.length());
		 
		 System.out.println("After Swap: "+first+last);
		
		
		

	}

}