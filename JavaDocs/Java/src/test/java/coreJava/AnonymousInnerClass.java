package coreJava;

class Library {

	public void showBooks() {
		System.out.println("All books in lib");
	}

}

//class SchoolLibrary extends Library{
//	public void showBooks() {
//		System.out.println("School books only");
//	}
//	
//}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Library lib = new SchoolLibrary();
		Library lib = new Library() {
					public void showBooks() {
						System.out.println("School books only");
						}
			};

		lib.showBooks();
	}

}
