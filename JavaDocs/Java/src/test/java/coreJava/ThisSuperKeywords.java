package coreJava;

class A extends Object{
	
	A(){
		super();
		System.out.println("Cons,This is A");
	}
	
	A(int n){
		super();
		System.out.println("This cons Para A"+n);
	}
	
}

class B extends A{
	
	B(){
		super(5);
		System.out.println("Cons, This is B");
	}
	
	B(int n){
		//super(n);
		this();
		System.out.println("This is Para "+n);
	}
	
}

public class ThisSuperKeywords {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//B b = new B();
		B b1 = new B(5);
		

	}

}
