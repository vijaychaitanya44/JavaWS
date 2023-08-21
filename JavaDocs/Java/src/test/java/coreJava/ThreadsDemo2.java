package coreJava;

class Pen1 implements Runnable {
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Write");
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Pencil1 implements Runnable {

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Earase");
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

public class ThreadsDemo2 {

	public static void main(String[] args) {

//	Pen1 a = new Pen1();
//	Pencil1 b = new Pencil1();

		Runnable a = new Pen1();
		Runnable b = new Pencil1();
		Runnable c = () -> {
			try {
				for (int i = 0; i < 5; i++) {
					System.out.println("Namaste");
					Thread.sleep(10);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		};

		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);

		t1.start();
		t2.start();
		t3.start();

	}

}
