package coreJava;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 5) {
			System.out.println("Hello" + i);

			int j = 1;
			while (j <= 3) {
				System.out.println("Hello world" + j);
				j++;
			}
			i++;
		}
		System.out.println("Bye" + i);
	}

}
