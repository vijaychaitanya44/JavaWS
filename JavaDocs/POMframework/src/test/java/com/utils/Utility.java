package com.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class Utility {
	
	
	public static WebDriver startBrowser(String browserName, String URL) {
		WebDriver driver= null;
		//browserName = browserName.toLowerCase();
		if(browserName.contains("google") ||  browserName.contains("chrome")|| browserName.contains("gc")|| browserName.contains("google chrome")){
			driver = new ChromeDriver();
		
		}
		else if(browserName.contains("ff") || browserName.contains("firefox")|| browserName.contains("mozilla")){
			driver = new FirefoxDriver();
		}
		
		else if(browserName.contains("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Given browser name is not valid");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
		
	}

	public static void clickElement(WebDriver driver, By locator) {

		try {
			driver.findElement(locator).click();
		} catch (Exception e) {
			try {
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(locator)).click().perform();
			}
			catch (Exception e2) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", driver.findElement(locator));
			}
		}
	}
}
