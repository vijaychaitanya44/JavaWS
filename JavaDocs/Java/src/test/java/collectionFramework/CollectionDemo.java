package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Collection<String> c = new ArrayList<>();
		c.add("Fish");
		c.add("Apple");
		//System.out.println(c);
		c.remove("Fish");
		//System.out.println(c);
		c.add("Cat");
		//System.out.println(c);
		c.contains("Cat");
		c.isEmpty();
		Object[] arr=c.toArray();          
//		for(String str: c) {
//		
//		System.out.println(str);
//		}
//	}
		LinkedList l = new LinkedList(c);
		System.out.println(l);

	}
}
