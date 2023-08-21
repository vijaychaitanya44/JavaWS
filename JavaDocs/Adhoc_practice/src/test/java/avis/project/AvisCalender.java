package avis.project;

import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AvisCalender {

	public static void calenderSelect(WebDriver driver, String month, int date) {

		for (int i = 0; i < 7; i++) {

			try {
				WebElement calDate = driver
						.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group')][div[div[span[text()='"
								+ month + "']]]]//tbody/tr/td/a[text()='" + date + "']"));
				if (calDate.isDisplayed()) {
					calDate.click();
					break;
				}
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.avis.com");
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//div[1]/angucomplete-alt/div/input[@id='PicLoc_value' and @name ='anguPicLoc']"))
				.sendKeys("EWR");
		Thread.sleep(3000);

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'EWR')]"))).pause(3000).click().build()
				.perform();
		Thread.sleep(3000);
		// System.out.println(driver.findElement(By.xpath("//div[1]/angucomplete-alt/div/input[@id='PicLoc_value'
		// and @name ='anguPicLoc']")).getText();

		Select sc = new Select(driver.findElement(By.id("reservationModel.personalInfoRQ.age")));
		sc.selectByVisibleText("24");

		driver.findElement(By.xpath("//div[2]/input[@name='reservationModel.pickUpDateDisplay']")).click();
		Thread.sleep(3000);
		calenderSelect(driver, "July", 30);
		calenderSelect(driver, "August", 1);
		driver.findElement(By.id("res-home-select-car")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement car = driver.findElement(By.xpath("//div[div[div[2][h3[text()='Premium']]]]//a[text()='Pay Later']"));
		Thread.sleep(10000);
		//js.executeScript("arguments[0].scrollIntoView();", car);
		
		car.click();
	}
}