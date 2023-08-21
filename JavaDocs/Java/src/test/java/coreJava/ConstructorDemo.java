package coreJava;

class Human1 {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Human1() {
		age = 12;
		name = "kuttu";
		System.out.println("Def cons");
	}

	public Human1(String name) {
		age = 44;
		this.name = name;
	}

	public Human1(int age, String name) {
		this.age = age;
		this.name = name;
	}

}

public class ConstructorDemo {

	public static void main(String[] a) {

		Human1 h = new Human1();
		System.out.println(h.getName() + ": " + h.getAge());
		Human1 h1 = new Human1(22, "Appl");
		System.out.println(h1.getName() + ": " + h1.getAge());
		Human1 h2 = new Human1("Banana");
		System.out.println(h2.getName() + ": " + h2.getAge());

	}

}
