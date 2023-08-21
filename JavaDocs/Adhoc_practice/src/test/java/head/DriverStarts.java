package head;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverStarts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.get("https://www.youtube.com");
	
	System.out.println(driver.getTitle());
	
	driver.close();
	
		
		
		
	}

}
