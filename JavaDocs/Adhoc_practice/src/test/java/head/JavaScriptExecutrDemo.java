package head;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutrDemo {

	public static void main (String[]args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");
		//driver.findElement(By.name("btnK")).click();
		
		WebElement ele = driver.findElement(By.name("btnK"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//jse.executeScript("document.getElementsByName('btnK')[0].click()");
		
		jse.executeScript("arguments[0].click()", ele);
		
		
		System.out.println("done");
	
		
		
	}
}
