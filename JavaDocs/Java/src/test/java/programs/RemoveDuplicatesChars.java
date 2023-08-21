package programs;

public class RemoveDuplicatesChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="caterpiller";
		//char cs[]= {'c','a','t','e','r','p','i','l','l','e','r'};
		//String c = new String(cs);
		String nodup="";
		char c[] = s.toCharArray();
		
		
		for(int i=0;i<c.length;i++) {
			 boolean dupli=false;
			for(int j=i+1;j<c.length;j++) {
				
				if(c[i]==c[j]) {
					dupli = true;
				}
			}
			
			if(!dupli) {
				nodup = nodup+c[i];
				System.out.println(c[i]);
			}
		}
		System.out.println(nodup);
		
	}

}
