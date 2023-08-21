package coreJava;

class Student{
	
	String name;
	int rollno;
	int marks;
}

public class ArrayOfObjects {
	
	public static void main(String[]a) {
		
		Student s1 = new Student();
		s1.name = "VJ";
		s1.rollno= 44;
		s1.marks= 345;
		Student s2 = new Student();
		s2.name ="Aj";
		s2.rollno=99;
		s2.marks=567;
		Student s3 = new Student();
		s3.name= "Pj";
		s3.rollno= 11;
		s3.marks=901;
		
		
		Student [] students = new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		//System.out.println(s1.name+" "+s1.rollno+" "+s1.marks);
		
		for(int i=0;i<students.length;i++) {
		//System.out.println(students[i].name+" "+students[i].rollno+" "+students[i].marks);
		}
		
		for(Student stud:students) {
			System.out.println(stud.name+" "+stud.rollno+" "+stud.marks);
			
		}
		
		
	}

}
