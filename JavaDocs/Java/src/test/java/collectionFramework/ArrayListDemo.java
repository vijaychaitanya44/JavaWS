package collectionFramework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListDemo {

	public static List synchronizedList(List l1) {
		return l1;
		
	}
	public static void main(String[] args) {
		
		
		
		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();
		System.out.println(l1 instanceof Serializable); //True
		System.out.println(l2 instanceof Cloneable);	//True
		System.out.println(l1 instanceof RandomAccess);	//True
		System.out.println(l2 instanceof RandomAccess);	//False	
		
		List sycL = (List) Collections.synchronizedCollection(l1);
		
	
	}

}
