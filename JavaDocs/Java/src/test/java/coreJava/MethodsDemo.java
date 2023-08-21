package coreJava;

class Computer {

	public void playMusic() {
		System.out.println("Playing Music...");
	}

	public String getMeAPen(int cost) {

		if (cost >= 10) {
			return "Pen";
		}
		return "nothing";
	}

}

public class MethodsDemo {

	public static void main(String[] a) {

		Computer c = new Computer();

		c.playMusic();
		String result =c.getMeAPen(12);
		System.out.println(result);
	}
}
