package coreJava;

class Counter {
	int count;

	public synchronized void increment() {
		count++;
	}
}

public class ThreadsDemo3 {

	public static void main(String[] args) throws InterruptedException {


		Counter c= new Counter();
		Runnable c1 = () -> {
			for (int i = 1; i <= 10000; i++) {
				//System.out.println(i);
				c.increment();
			}
			;

		};

		Runnable c2 = () -> {
			for (int i = 1; i <=10000; i++) {
				c.increment();
			}

		};
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		//Thread.sleep(3000);
		System.out.println(c.count);

	}

}
