package com.practice.program;

public class TargetNumber {

	public static void main(String[] args) {
		
		int target = 33;
		
		int arr[]= {22,11,30,3,6,12};
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==target) {
					
					System.out.println(i+","+j);
				}
			}
		}

	}

}
