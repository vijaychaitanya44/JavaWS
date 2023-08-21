package programs;

import java.io.InputStream;
import java.util.Scanner;

public class Employee {
	
	int id;
	String name;
	float sal;
	Scanner s2;
	
	Employee(Scanner s1){
		s2= s1;
	}
	
	public void setEmp() {
		System.out.println("Enter emp Id");
		id = s2.nextInt();
		s2.nextLine();
		System.out.println("Enter emp Name");
		name = s2.nextLine();
		
		System.out.println("Enter emp Sal");
		sal= s2.nextFloat();
	}
	
	 void display() {
		 System.out.println("ID: "+id);
		 System.out.println("Name: "+name);
		 System.out.println("Salary: "+sal);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		Employee e1 = new Employee(s1);
		
		e1.setEmp();
		e1.display();
	}

}
