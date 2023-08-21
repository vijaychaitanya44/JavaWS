package coreJava;

class Aa {

	Aa() {

		System.out.println("This is constructor");
	}

	void show() {
		System.out.println("Only method");
	}

}

public class AnonymousObject {

	public static void main(String args[]) {

		 new Aa();
		 new Aa().show();
		 new Aa().show();
	}

}
