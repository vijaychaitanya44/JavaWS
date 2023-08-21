package coreJava;

@FunctionalInterface
interface InterCandy {
	void showChoclates(int number);

}

public class LamdaAndFuntionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	InterCandy c = (int number) -> 
			//	System.out.println("no of choclates: " + number);
	//	InterCandy c = (number) -> 
		InterCandy c = number->
				System.out.println("no of choclates: " + number);	

		c.showChoclates(40);

	}

}
