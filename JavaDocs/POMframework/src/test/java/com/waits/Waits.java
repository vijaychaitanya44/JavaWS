package com.waits;

import org.openqa.selenium.WebDriver;

public class Waits {
	
	
	
	
	public static void waitForSeconds(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		}
		catch(InterruptedException e) {
		}
	}

}
