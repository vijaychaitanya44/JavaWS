package coreJava;

class Pen extends Thread{
	public void run() {
		try {
		for(int i=0;i<100;i++) {
		System.out.println("Write");
		Thread.sleep(10);
		}}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Pencil extends Thread{
	
	public void  run() {
		try {
		for(int i=0;i<100;i++) {
			System.out.println("Earase");
			Thread.sleep(10);
		}
	}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
}
public class ThreadsDemo {
	
	public static void main(String[]args) {
	Pen a = new Pen();
	Pencil b = new Pencil();
	a.setPriority(Thread.MAX_PRIORITY);
	a.start();
	b.start();
	
	
	}
	
}
