package coreJava;


class Soap{
	
	void price() {
		System.out.println("This is normal soap");
	}
}

class Lifeboy extends Soap{
	void  price() {
		System.out.println("This is Lifboy soap");
	}
	
}

class Santoor extends Soap{
	
	void price() {
		System.out.println("This is Santoor soap");
	}
	
}
public class DynamicDispatchRunTimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Soap a = new Soap(); // Parent object
			
		a.price();
		a = new Lifeboy(); // Subclass one object
		a.price();
		a = new Santoor(); // Subclass two object
		a.price();
		

	}

}
