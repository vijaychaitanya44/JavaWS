package com.practice.program;

public class CharCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "aaabbbbccd";
		
		char temp= s.charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++) {
			
	
			if(s.charAt(i)==temp) {
				count++;
			}
			else {
				
				System.out.println(temp+""+count);
				temp=s.charAt(i);
				count =1;
			}
			
			
		}System.out.println(temp+""+count);
	}

}
