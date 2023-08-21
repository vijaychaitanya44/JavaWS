package head;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOnAmazon {

	public static void verifyLinks(String linkUrl) {

		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
			httpConn.setConnectTimeout(500);
			httpConn.connect();

			int respCode = httpConn.getResponseCode();

			if (respCode >= 400) {
				System.out.println(url + " :Its a broken link");
			} else {
				System.out.println(url + " :Its a valid Link");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {

			String url = links.get(i).getAttribute("href");

			verifyLinks(url);
		}

	}

}
