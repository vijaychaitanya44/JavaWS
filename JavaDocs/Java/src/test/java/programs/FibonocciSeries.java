package programs;

public class FibonocciSeries {
	
	static void fibo(int series) {
		
		int n1 =0;
		int n2 =1;
	
		int n3;
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<series;i++) {
			
			n3= n1+ n2;
			n1= n2;
			n2=n3;
			System.out.print(n3+" ");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibo(10);
		

	}

}
