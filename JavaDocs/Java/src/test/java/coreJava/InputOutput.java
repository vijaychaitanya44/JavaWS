package coreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
	
	public static void main(String a[]) throws IOException {
		
		InputStreamReader in = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(in);
		char c = (char)br.read();
		br.read();
		
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		System.out.println(n);
		System.out.println(c);
	}

}
