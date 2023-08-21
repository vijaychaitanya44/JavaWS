package coreJava;

public class ExceptionsDemo2Throw {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		
		try {
			j = 18 / i;
			if(j==0) 
				throw new ArithmeticException("I donant to print");
		}

		catch (ArithmeticException e) {
			
			System.out.println("Default output");
		}

		catch (Exception e) {
			System.out.println("Something went wrong" + e);
		}

		System.out.println(j);
		System.out.println("Bye");
	}
}
