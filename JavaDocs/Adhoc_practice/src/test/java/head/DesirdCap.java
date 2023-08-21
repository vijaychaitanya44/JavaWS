package head;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DesirdCap {
	
	public static void main(String[]args) {
		
		
		
		DesiredCapabilities ds = new DesiredCapabilities();
		
		
		
		WebDriver driver = new ChromeDriver();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("adv"))));
		
		
		FluentWait<WebDriver> waits = new FluentWait<>(driver);
		
		waits.ignoring(WebDriverException.class);
		waits.pollingEvery(Duration.ofSeconds(0));
		waits.withTimeout(Duration.ofSeconds(10));
		

}}
