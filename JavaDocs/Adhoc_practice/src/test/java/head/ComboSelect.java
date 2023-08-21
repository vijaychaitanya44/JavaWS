package head;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ComboSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/select-menu");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Select Option']")).click();

		WebElement option = driver.findElement(By.xpath("//div[text()='Group 2, option 1']"));

		Actions act = new Actions(driver);

		act.moveToElement(option).pause(Duration.ofSeconds(3)).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Group 2, option 1']")).click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		WebElement opt2 = driver.findElement(By.xpath("//div[text()='Another root option']"));

		jse.executeScript("arguments[0].scrollIntoView()", opt2);
		Thread.sleep(3000);
		opt2.click();
		
		
		driver.findElement(By.xpath("//div[text()='Select...']")).click();

		List<WebElement> reactList = driver.findElements(By.xpath("//div[contains(@id,'react-select-4')]"));

		for (WebElement e : reactList) {
			String opt = e.getText();
			System.out.println(opt);

			String arr[] = { "Green", "Red","Blue","Black"};

			for (String col : arr) {

				if (opt.equals(col)) {
					e.click();
				}

			}

		}
		
		
		driver.findElement(By.xpath("//b[text()='Standard multi select']")).click();
		
		WebElement combo= driver.findElement(By.id("cars"));
		
		Select sel =new  Select(combo);
		
		sel.selectByValue("volvo");
		sel.selectByVisibleText("Audi");
		
		

	}

}
