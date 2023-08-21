package coreJava;

@FunctionalInterface
interface Tablet{
	
	int showDevices(int n1, int n2);
}


public class LambdaDemo {

	public static void main(String []args) {
		
		Tablet t =(n1,n2)->n1+n2;
		int res = t.showDevices(10, 20);
		System.out.println(res);
		
	}
}
