package programs;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,4,5,2,4,4,2,4,9,0,1,6,45,10,12,1,12};
		
		
		for(int i=0;i<arr.length;i++) {
			boolean dupli=false;{
				for(int j=0;j<i;j++) {
					
					if(arr[i]==arr[j]) {
						dupli = true;
					}
				}
			}
			if(!dupli) {
				System.out.println(arr[i]);
			}
		}

	}

}
