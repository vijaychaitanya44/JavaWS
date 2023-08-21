package head;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://learn-automation.com/");

		System.out.println(driver.manage().timeouts().getPageLoadTimeout().getSeconds());
		System.out.println(driver.manage().timeouts().getScriptTimeout().getSeconds());
		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout().getSeconds());
//
//		driver.get("https://www.yahoo.com");
//
	TakesScreenshot scr = (TakesScreenshot) driver;
//
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
				new File("D:\\Eclipse WS\\Interview_Prep\\Adhoc_practice\\screenDump\\apple1.png"));

//		File source = scr.getScreenshotAs(OutputType.FILE);
//		File Dest = new File("D:\\Eclipse WS\\Interview_Prep\\Adhoc_practice\\screenDump\\apple.png");
//
//		FileUtils.copyFile(source, Dest);

	}

}
