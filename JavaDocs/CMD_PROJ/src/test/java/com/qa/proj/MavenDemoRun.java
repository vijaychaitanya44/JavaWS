package com.qa.proj;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenDemoRun {
	
	
	@Test
	public void TestChrome() {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title =driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title.contains("Google"), true);
		
		driver.close();
	}
	
	@Test
	public void TestFireFox() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title =driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title.contains("Google"), true);
		
		driver.close();
		
		
	}
	
	@Test
	public void TestCase1() {
		
		System.out.println("TestCase1");
		
	}
	@Test
	public void TestCase2() {
		System.out.println("TestCase2");
	}

}
