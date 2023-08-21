package coreJava;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =13;
		int y= 3;
		int z= 13;
		
		if(x>y && x>z) {
			System.out.println("X is greater");
		}
		else if(y>z) {
			System.out.println("Y is greater");
			
		}
		else if(x==y || x==z){
			
			if(x==z) {
				System.out.println();
			}
			System.out.println("ALL are equal");
		}
		else {
			
			
			System.out.println("Z is greater");
		}
	}

}
