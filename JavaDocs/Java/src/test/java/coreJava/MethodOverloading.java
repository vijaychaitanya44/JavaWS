package coreJava;

class Calculator {

	public int add(int n1, int n2) {

		return n1 + n2;
	}
	
	public int add(int n1, int n2,int n3) {

		return n1 + n2+ n3;
	}
	
	public double add(double n1, int n2,int n3) {

		return n1 + n2+ n3;
	}
	
}

public class MethodOverloading {
	
	public static void main(String []a) {
		
		int data =10;
		Calculator c1 = new Calculator();
		
		 
		int r1 = c1.add(3, 5);
		System.out.println(r1);
		int r2 = c1.add(5, 6,9);
		System.out.println(r2);
		
		double d= c1.add(8.9, 2,5);
		System.out.println(d);
		
		
	}

}
