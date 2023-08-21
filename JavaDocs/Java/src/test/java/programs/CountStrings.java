package programs;

public class CountStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is an apple Iphone model 2023";
		
		
		System.out.println(str.split(" ").length);
		
		String []arr = str.split(" ");
		
		for(String s:arr) {
			System.out.println(s);
		}
		
		

	}

}
