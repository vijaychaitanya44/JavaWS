package coreJava;

public class EnumDemo {
	
	enum Days{
		Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
	}
	
	enum Color{
		Red,Yellow,Green
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Days d = Days.Monday;
			
			System.out.println(d);
			
			Days [] dd = Days.values();
			
			for(Days d1:dd) {
				System.out.println(d1);
			}
			
			
			
			
			
	}

}
