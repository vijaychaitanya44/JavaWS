package coreJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionsDemo1 {
	
	public static void main(String []args) {
		
		
		List<String> c =  new ArrayList<>();
		
		c.add("Honey");
		c.add("Bunny");
		c.add("Sunny");
		c.add("56");
		
		for(Object a: c) {
			System.out.println(a+""+5);
		}
		c.set(0, "SuperHoney");
		
		System.out.println(c.get(0));
	}

}
