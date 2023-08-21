package collectionFramework;

import java.util.HashSet;
import java.util.Hashtable;

public class HashSetDemo {
	
	public static void main( String[]args)
	{
		
		Hashtable ht = new Hashtable();
		
		ht.put('K', 123);
		ht.put('L',789);
		
		System.out.println(ht );
		
		HashSet s = new HashSet();
		
		s.add(45);
		System.out.println(s.add(45));
		s.add(null);
		s.add("Vijay");
		s.add('F');
		System.out.println(s);
	}
}
