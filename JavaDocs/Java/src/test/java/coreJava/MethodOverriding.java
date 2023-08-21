package coreJava;

import jpack.Ja;
import jpack.Jb;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jb j =new Jb(); 
			j.show();
			j.config();
			Ja a = new Ja();
			//System.out.println(a.marks);
			a.show();
		//System.out.println(mar);
		Jc c = new Jc();
		System.out.println(c.marks);
		
		
	}
}
