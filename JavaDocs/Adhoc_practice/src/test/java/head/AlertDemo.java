package head;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ineuron-courses.vercel.app/practise");

		WebElement alert1 = driver.findElement(By.xpath("//button[text()='Click to show']"));
		WebElement alert2 = driver.findElement(By.xpath("//button[text()='Click to see after 5s']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", alert2);
		Thread.sleep(3000);
		alert2.click();

		for (int i = 0; i < 10; i++) {

			try {
				Alert al1 = driver.switchTo().alert();
				String ss = al1.getText();

				if (ss.contains("code")) {
					System.out.println("Alert is present");
					al1.dismiss();
					break;
				} else {
					System.out.println("No alert present");
				}

			} catch (NoAlertPresentException e) {
				Thread.sleep(1000);
				System.out.println("Waiting for alert");
			}

		}

	}

}
