package jpack;

abstract class Bottle{
	
	public abstract void typeOfBottle();
	
	public abstract void typeOfLiquid();
	
	
	static void method1() {
		System.out.println("Apple");
	}
}

 class WhiskeyBottle extends Bottle {

	@Override
	public void typeOfBottle() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void typeOfLiquid() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

public class AbstractPractice extends Bottle{

	@Override
	public void typeOfBottle() {
		// TODO Auto-genera''ted method stub
		System.out.println("typeBottle");
	}

	@Override
	public void typeOfLiquid() {
		// TODO Auto-generated method stub
		System.out.println("liquid");
	}
	
	public static void main(String[]a) {
		Bottle.method1();
	}

}
