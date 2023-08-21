package coreJava;

import java.util.ArrayList;
import java.util.List;

class Single {
	
	private static Single sobj = new Single();
	
	private Single() {
		
	}
	
	public static Single getInstance() {
		
		return sobj;
	}
	
	public static void show() {
		System.out.println("Showing object");
	}

}

public class SingleTonClassDemo2 {
	public static void main(String[] args) {

		Single obj1 =Single.getInstance();
		
		obj1.show();
	
	}

}
