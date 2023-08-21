package coreJava;

class Dear{
	
	public void show() {
		try {
			Class.forName("ArrayDemo");
			}
			catch(ClassNotFoundException e){
			e.printStackTrace();
			}
		
	}
}

public class ExceptionsDemo4Throws {

	public static void main(String[] args) {
	
		Dear d = new Dear();
		d.show();
	}
}
