package coreJava;

class OuterClass {
	int size;

	public void show() {
		System.out.println("Outer class show");
	}

		static class InnerClass {
					public void config() {
						System.out.println("Inner class config");
					}
			}

}

public class InnerClassDemo {
	
	public static void main(String[]a) {
		
		OuterClass  oc = new OuterClass();
		oc.show();
		//For inner class non -static
		//OuterClass.InnerClass in = oc.new InnerClass(); 
		
		OuterClass.InnerClass oin = new OuterClass.InnerClass();
		oin.config();
	}
	 

}
