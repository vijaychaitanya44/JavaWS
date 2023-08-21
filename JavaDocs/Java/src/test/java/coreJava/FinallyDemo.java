package coreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyDemo {
	
	public static void main(String[]a) throws IOException {
		
		
		int n =0;
		String name="";
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			name=br.readLine();
			n= Integer.parseInt(br.readLine());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println(n);
			System.out.println(name);
			br.close();
		}
	}

}
