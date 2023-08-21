package coreJava;

import java.util.Objects;

class Furniture {
	int price;
	String model;
	
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Furniture other = (Furniture) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}

	public String toString() {
		return model+": "+price;
	}
	
	public boolean equals(Furniture that) {
		
		if(this.model.equals(that.model)&& this.price==that.price) {
			return true;
		}
		else {
			return false;
		}
	}
}


public class ObjectClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Furniture f1 = new Furniture();
		f1.model="Chair";
		f1.price=5000;
		
		Furniture f2 = new Furniture();
		f2.model="Chair";
		f2.price=5000;
		
	//	boolean result = f1==f2;
		boolean result = f1.equals(f2);
		
		System.out.println(result);
		
		

	}

}
