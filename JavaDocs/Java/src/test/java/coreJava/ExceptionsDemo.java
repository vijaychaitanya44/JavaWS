package coreJava;

public class ExceptionsDemo {

	public static void main(String[] args) {
		int i = 2;
		int j = 0;

		int nums[] = new int[5];
		String str =null;
		try {
			j = 18 / i;
			System.out.println(str.length());
			System.out.println(nums[1]);
			System.out.println(nums[5]);
			
		}
	
		
		catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("Cannot devide by zero" + e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Check your limit value"+e);
		}
		catch(Exception e) {
			System.out.println("Something went wrong"+e);
		}

		System.out.println(j);
		System.out.println("Bye");
	}
}
