package com.practice.program;

public class StringReverse {

	public static void main(String[] args) {
		
		
		StringBuffer str = new StringBuffer("AppleBoy");
		StringBuilder act = new StringBuilder("junejuly");
		String s =  act.reverse().toString();
		System.out.println(s);
		
		String ss ="january";
		
		for(int i=ss.length()-1;i>=0;i--) {
			char c= ss.charAt(i);
			System.out.print(c);
		}
		

	}

}
