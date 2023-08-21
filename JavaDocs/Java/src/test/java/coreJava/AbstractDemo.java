package coreJava;

abstract class Car {

	private String name;
	final String color = "Red";

	public abstract void drive();

	public abstract void fly();

	public void playMusic() {
		System.out.println("Play  music");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

abstract class WagonR extends Car {

	public void drive() {
		System.out.println("WagonR is driving...");
	}

	public abstract void fly();
}

class UpdatedWagorR extends WagonR {

	@Override
	public void fly() {
		System.out.println("Flying");
	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new UpdatedWagorR();

		c.drive();
		c.playMusic();
		c.fly();
		System.out.println(c.color);
		c.setName("THar");
		String n = c.getName();
		System.out.println(n);
	}

}
