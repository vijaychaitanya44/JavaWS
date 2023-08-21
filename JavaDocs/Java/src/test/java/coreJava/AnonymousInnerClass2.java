package coreJava;

abstract class Pos{
	
	abstract void change();
	
}




public class AnonymousInnerClass2 {

	public static void main(String[] args) {
		
		Pos st = new Pos() {
			public void change(){
				System.out.println("Station");
			}
		};
		st.change(); 
	}

}
