package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int num = 32;
		List<Integer> binary= new ArrayList<>();
		
		while (num >0) {
			int rem = num%2;
			
			num = num/2;
			//System.out.println(rem);
			
			binary.add(rem);
		}
		
		for(int i=binary.size()-1;i>=0;i--) {
			System.out.print(binary.get(i));
	}

}
}