package jpack;

enum Fruits {
	Apple, Banana, PineApple, Kiwi, Orange, Mango, Gauva
}

public class EnumPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruits f = Fruits.Orange;

		System.out.println(f.ordinal());

		Fruits[] allFruits = Fruits.values();

		for (Fruits a : allFruits) {
			System.out.println(a);
		}

//		if(f==Fruits.Apple) {
//			System.out.println("Its Orange");
//		}else if(f==Fruits.Apple) {
//			System.out.println("Its Red");
//		}else if(f== Fruits.Banana) {
//			System.out.println("Its Yellow");
//		}else {
//			System.out.println("Not valid");
//		}
//		

		switch (f) {

		case Apple: {
			System.out.println("Its Red");
			break;
		}

		case Banana: {
			System.out.println("Its Yello");
			break;
		}

		case Orange: {
			System.out.println("Its Orange");
			break;
		}

		default: {
			System.out.println("Its something");
			break;
		}
	}

	}
}
