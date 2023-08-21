package head;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ineuron-courses.vercel.app/login");

		String parentWindow = driver.getWindowHandle();

		List<WebElement> links = driver.findElements(By.xpath("//div[@class='social-btns']/a"));

		for (int i = 0; i < links.size(); i++) {

			links.get(i).click();
			Thread.sleep(3000);
			// After click on each link driver has to switch back to parent window to click
			// on next element
			driver.switchTo().window(parentWindow);
		}

		Set<String> allWindows = driver.getWindowHandles();

		List<String> window = new ArrayList<>(allWindows);

		for (String tab : window) {
			if (driver.switchTo().window(tab).getCurrentUrl().contains("youtube")) {
				System.out.println(driver.getTitle());
				break;
			}
		}

	}

}
