package coreJava;

class Fruits {
	void color1() {
		System.out.println("Fruit color");

	}
}

class Apple extends Fruits {

	void color2() {
		System.out.println("Apple color");
	}
}

public class UpcastDowncast {

	public static void main(String[] a) {
		// Fruits f= new Fruits();
		Fruits f1 = new Apple();// implicit up casting;
		f1.color1();
		Apple f2 = (Apple) f1; //
		f2.color2();

	}
}
