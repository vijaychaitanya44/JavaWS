package coreJava;

//Final - variable, method, Class

 class Compute{
	
	final public void show() {
		System.out.println("Compute show");
	}
	
	 public void add(int a , int b) {
		System.out.println(a+b);
	}
}

class AdvComp extends Compute{
	
	public void show1() {
		System.out.println("Adv compute");
	}
}
public class FinalKeyword {

	public static void main(String[]args) {
	Compute s = new Compute();
	s.show();
	s.add(5, 8);
	
	AdvComp ad = new AdvComp();
	ad.show();
	ad.add(8, 8);
	}
}
