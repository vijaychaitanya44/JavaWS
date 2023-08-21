package jpack;

enum Laptop{
	MacBook(2000),XPS(2200), Surface(1500), THinkpad;
	
	private int price;
	
	private Laptop() {
		
		price =700;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private Laptop(int price) {
		this.price = price;
	}
}

public class EnumPrac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop lap = Laptop.MacBook;
		System.out.println(lap+": "+lap.getPrice());
		
		for (Laptop lap1:Laptop.values()) {
			System.out.println(lap1+": "+lap1.getPrice());
		}

	}

}
