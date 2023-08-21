package programs;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr1[] = {4,7,1,9,66,3,6,100};
		
		int temp;
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=i+1;j<arr1.length;j++) {
				
				if(arr1[i]>arr1[j]) {
					temp =arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		
		for(int n:arr1) {
		System.out.print(n+" ");
		}
	}

}
