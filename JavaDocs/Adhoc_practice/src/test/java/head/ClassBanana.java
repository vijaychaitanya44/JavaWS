package head;

public class ClassBanana {
	
	
	ClassBanana(){
		
	}
	public void method1() {
		
		System.out.println("Banana");
	};

	

	public static void main(String[]args) {
		
		
	try {
		Class<?> b = Class.forName("ClassBanana");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

		
	}
	
	
}
