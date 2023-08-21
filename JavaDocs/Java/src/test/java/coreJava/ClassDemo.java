package coreJava;



class Calc{
	
	public int add(int a, int b) {
		System.out.println("Result is: ");
		return a+b;
	}
	
}


public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int a =10;
			int b= 20;
		
			Calc c = new Calc();
			
			System.out.println(c.add(a, b));
			
	}

}
