package head;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEScrollToView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.get("https://docs.oracle.com/javase/7/docs/api/javax/xml/bind/package-summary.html#:~:text=a%20validate%20operation.-,Package%20javax.,%2C%20marshalling%2C%20and%20validation%20capabilities.");
		driver.get("https://www.javatpoint.com/java-tutorial");
		// driver.findElement(By.xpath("//button[text()='✕']")).click();

		WebElement ele = driver.findElement(By.xpath("//legend[normalize-space()='Do You Know?']"));
		System.out.println(ele.isDisplayed());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);

		js.executeScript("arguments[0].scrollIntoView()", ele);

		Thread.sleep(3000);

		// js.executeScript("arguments[0].click()", buy);

	}

}
