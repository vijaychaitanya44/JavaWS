package com.waits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class HandleAlerts {
	
	
	public static Alert handleAlert(WebDriver driver) {	
	Alert ale = null;
	for(int i=1;i<15;i++) {
		
		try {
			ale= driver.switchTo().alert();
			break;
		}
		catch(NoAlertPresentException e) {
			System.out.println("Waiting for alert");
			Waits.waitForSeconds(1);
		}
	}
	return ale;
	}
	
	public static Alert handleAlert(WebDriver driver, int waitTime) {	
		Alert ale = null;
		for(int i=1;i<waitTime;i++) {
			
			try {
				ale= driver.switchTo().alert();
				break;
			}
			catch(NoAlertPresentException e) {
				System.out.println("Waiting for alert");
				Waits.waitForSeconds(1);
			}
		}
		return ale;
		}

}
