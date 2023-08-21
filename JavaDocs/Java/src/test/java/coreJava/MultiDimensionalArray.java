package coreJava;

import java.util.Scanner;

public class MultiDimensionalArray {

	static int [][] printMultiDimArray(int rows, int cols){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter multi array values");
		int arr1[][] = new int[rows][cols];
		
		for(int i=0;i<rows;i++){
			
			for(int j=0;j<cols;j++) {
				
				arr1[i][j]= sc.nextInt();
			}
		}
		
		
	for(int i=0;i<rows;i++){
			
			for(int j=0;j<cols;j++) {
				
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	
	for(int n[]:arr1) {
		
		for(int m:n) {
			System.out.print(m+" ");
		}
		System.out.println();
	}

	return arr1;
	
	

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		printMultiDimArray(2,3);
		
	}

}
