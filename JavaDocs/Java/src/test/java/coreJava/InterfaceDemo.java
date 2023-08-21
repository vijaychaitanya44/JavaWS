package coreJava;

interface Flowers {

	public void color();
}

class Lily implements Flowers {
	public void color() {
		System.out.println("Lilys are white");
	}
}

class Roses implements Flowers {
	public void color() {
		System.out.println("Roses are Red");
	}
}

class Florist {

	public void giveFlowers(Flowers flower) {
		flower.color();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {

		Flowers r = new Roses();
		// r.color();
		Florist f = new Florist();
		f.giveFlowers(r);

	}

}
