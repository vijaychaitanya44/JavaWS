package com.practice.program;

public class NumberReverse {

	public static void main(String[] args) {
		
		
		int n = 2345432;
		int original = n;
		int number =0;
		
		while(n>0) {
			
		int	rem = n%10;
			number = number*10+rem;
			n=n/10;
			
		}
		System.out.println(number);
		if(original==number) {
			System.out.println("number is palindrome");
			
		}
		else {
			System.out.println("No");
		}
	}

	
	
}
