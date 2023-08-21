package coreJava;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i;
		for(i=0;i<5;i++) {
			System.out.println("Day "+i);
			
			for(int j=1;j<=5;j++) {
				System.out.println("Hour is "+(j+8)+"-"+(j+9));
			}
		}

	
//	int j=0;
//	for(;;) {
//		System.out.println("world"+j);
//	}
		
		

}
}