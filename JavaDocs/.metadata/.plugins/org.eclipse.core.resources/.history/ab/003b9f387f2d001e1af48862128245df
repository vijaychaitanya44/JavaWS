package head;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		Actions act = new Actions(driver);
		
		WebElement src = driver.findElement(By.id("draggable"));
		System.out.println(src.isDisplayed());
		
		
		WebElement dest = driver.findElement(By.id("droppable"));
		//act.dragAndDrop(src, dest).perform();
		
		
		act.clickAndHold(src).moveToElement(dest).release().build().perform();
		
	
		
		
		
		
		
	
	}
}
