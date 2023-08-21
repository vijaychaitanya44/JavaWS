package coreJava;

//BaseClass
class Calcc {

	int add(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}

}

//Subclass
class AdvCalc extends Calcc {

	int mult(int a, int b) {
		return a * b;
	}

	double div(double a, double b) {

		return a / b;
	}
}

class ScetificCalc extends AdvCalc{

	double power(int a, int b) {

		return Math.pow(a, b);
	}
}

public class InheritenceDemo {

	public static void main(String[] args) {
		Calcc c = new Calcc();
		AdvCalc ac = new AdvCalc();
		System.out.println(ac.add(2, 5));
		System.out.println(ac.add(4, 5));
		ScetificCalc sc = new ScetificCalc();
		System.out.println(sc.power(2, 6));
		
		
	}
}
