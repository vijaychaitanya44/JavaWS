package coreJava;


class Human{
	
	private String name;
	private int age;
	
	private String section;
	
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human();
		h1.setName("Vijay");
		h1.setAge(33);
		h1.setSection("A");
		System.out.println(h1.getName()+": "+ h1.getAge());
		System.out.println(h1.getSection());
	}

}
