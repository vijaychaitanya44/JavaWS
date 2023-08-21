package head;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		Thread.sleep(3000);
		driver.findElement(By.id("menu1")).click();
		System.out.println("done");
		List<WebElement> li = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

		for (WebElement dr : li) {
			String st = dr.getText();
			System.out.println(st);
			if (st.equals("JavaScript")) {
				dr.click();
				break;
			}
		}

	}

}
