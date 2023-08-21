package coreJava;


class MyException extends Exception{
	
	public MyException(String s) {
		super(s);
	}
}
public class ExceptionsDemo3MyExceptin {

	public static void main(String[] args) {
		int i = 20;
		int j = 0;
		
		
		try {
			j = 18 / i;
			if(j==0) 
				throw new MyException("I dont want to print zero");
		}

		catch (MyException e) {
			
			System.out.println("Default output "+e);
		}

		catch (Exception e) {
			System.out.println("Something went wrong" + e);
		}

		System.out.println(j);
		System.out.println("Bye");
	}
}
