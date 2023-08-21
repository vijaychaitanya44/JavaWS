package coreJava;

@FunctionalInterface
interface InterfaceK{
	void show();
	
}
/**
class ClassL implements InterfaceK{
	public void show() {
		System.out.println("Functional interface implementaion");
	}
}*/

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/***	
		InterfaceK k = new InterfaceK() {
			
			public void show() {
				System.out.println("from new Object");
			}
		};
		k.show();
		**/
		
		InterfaceK k=()->{
				System.out.println("anonymus calss obj");
			};
			k.show();
		};
		
		
	}


