package collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	
	public static void main(String[]args) {
		
		
		List<Integer> li = new ArrayList<>();
		
		li.add(12);
		li.add(55);
		li.add(90);
		li.add(22);
		li.add(null);
		boolean b=li.contains(9);
		System.out.println(b);
		
		System.out.println(li);
		
		li.remove(0);
		System.out.println(li);
		li.add(0, 50);
		System.out.println(li);
		
		li.set(0, 900);
		System.out.println(li);
		
		ListIterator<Integer> itr =li.listIterator(); 
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
		}
	}
}
