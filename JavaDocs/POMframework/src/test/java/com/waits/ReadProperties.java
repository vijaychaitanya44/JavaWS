package com.waits;

import java.io.FileReader;

public class ReadProperties  extends LoadProperties{

private String browser = null;
private String loginKey =null;
private String url =null;

ReadProperties r = new ReadProperties(); 
	
	public static void readProperties() {
		
		try {
			//browser =
			
		}
		catch(Exception e) {
			System.out.println("no such property present"+e.getMessage());
		}
	}
	
	
	
	
}
