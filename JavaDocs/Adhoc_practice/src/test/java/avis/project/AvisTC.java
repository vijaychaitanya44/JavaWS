package avis.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AvisTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.avis.com");
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//div[1]/angucomplete-alt/div/input[@id='PicLoc_value' and @name ='anguPicLoc']"))
				.sendKeys("EWR");

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'EWR')]"))).pause(3000).click().build()
				.perform();
		Thread.sleep(3000);
		// System.out.println(driver.findElement(By.xpath("//div[1]/angucomplete-alt/div/input[@id='PicLoc_value'
		// and @name ='anguPicLoc']")).getText();

		Select sc = new Select(driver.findElement(By.id("reservationModel.personalInfoRQ.age")));
		sc.selectByVisibleText("24");

		driver.findElement(By.id("res-home-select-car")).click();

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

//System.out.println(car);

		driver.findElement(By.xpath("//div[div[div[2][h3[text()='Economy']]]]//a[text()='Pay Later']")).click();

//div[contains(@class,'row avilableca')]//div/div/div/a[text()='Pay Later']

	}
}
