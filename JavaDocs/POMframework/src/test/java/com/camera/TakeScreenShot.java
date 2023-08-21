package com.camera;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void snapShot(WebDriver driver) {
		try {
			FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("D:\\Eclipse WS\\Interview_Prep\\POMframework\\screenShots\\"+getCurrentDate()+".png"));
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static String getCurrentDate() {

		String cDate = (new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy")).format(new Date());

		return cDate;
	}
	
	
	
	}

