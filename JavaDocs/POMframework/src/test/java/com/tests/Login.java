package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utils.Utility;
import com.waits.LoadProperties;

public class Login {

	
	@Test
	public void testLogin() {
		WebDriver driver =Utility.startBrowser("chrome", "https://www.google.com");
		System.out.println(driver.getTitle());
	}
}
