package programs;

public class CountChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "aaaabbbcccddd";
		
		char temp =str.charAt(0);
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			
			
			if(str.charAt(i)==temp) {
				count++;
			}
			else {
				System.out.print(temp+""+count);
				count=1;
				temp=str.charAt(i);
			}
		}
		System.out.print(temp+""+count);

	}

}
