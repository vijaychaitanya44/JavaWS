package coreJava;

import java.util.ArrayList;
import java.util.List;

class Abc {

}

public class SingleTonClassDemo {
	public static void main(String[] args) {

		
		Abc obj1 = new Abc();
		Abc obj2 = new Abc();
		
		
		System.out.println(obj1==obj2);
		
		
		System.out.println(obj1.equals(obj2));
		
		
		
		String prefix = "Maxi";
		
		List <String> a= new ArrayList<>();
		a.add("Cat");
		a.add("Dog");
		
		prefix="Ultra";
		
		for(String s: a) {
			
		}
		String apple = "apple";
		
	
	
	}

}
