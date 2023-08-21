package head;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenCapture {
	
	
	public static void screen_Capture(WebDriver driver) {
		
		try {
		TakesScreenshot scr = (TakesScreenshot)driver;
		
		File src = scr.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Eclipse WS\\Interview_Prep\\Adhoc_practice\\screenDump\\scrshot"+timeStamp()+".png");
		
		FileUtils.copyFile(src, dest);}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String timeStamp() {
		
		
		String timeStamp = new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy").format(new Date());
		
		return timeStamp;
	}
	
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		screen_Capture(driver);
		Thread.sleep(3000);
		driver.navigate().to("https://www.youtube.com");
		
		screen_Capture(driver);
		
		System.out.println(timeStamp());
	}
}
