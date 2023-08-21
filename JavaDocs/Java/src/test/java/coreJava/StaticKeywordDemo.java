package coreJava;


class Mobile{
	
	String brand;
	int price;
	static String name;
	
	void show() {
		System.out.println(brand +": "+price+": "+name);
	}
	
	public static void show1(Mobile obj) {
		System.out.println(obj.brand +": "+obj.price+": "+name);
	}
}
public class StaticKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile obj1 = new Mobile();
		obj1.brand="Apple";
		obj1.price =1700;
		obj1.name ="SmartPhone";
		
		Mobile obj2 = new Mobile();
		
		obj2.brand="Samsung";
		obj2.price=1500;
		obj2.name="SmartPhone";
	
		obj1.show();
		
		Mobile.name="Phones";
		
		//obj2.show();
		obj1.show();
		Mobile.show1(obj2);
		
	}

}
