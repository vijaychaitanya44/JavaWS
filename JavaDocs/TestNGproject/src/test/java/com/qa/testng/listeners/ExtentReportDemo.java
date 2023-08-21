package com.qa.testng.listeners;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {

	@Test
	
	public void extentReport() {
		
		ExtentReports rp = new ExtentReports();
		ExtentSparkReporter reporter = new ExtentSparkReporter("D:\\Eclipse WS\\JavaDocs\\Interview_Prep-prep1\\TestNGproject\\extentreport\\myExtentreport.html");
		
		reporter.config().setReportName("ExtentDemoReport");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setDocumentTitle("Colorful report");
		
		rp.attachReporter(reporter);
		
		ExtentTest t1 = rp.createTest("Login test");
		ExtentTest t2 = rp.createTest("Login 2");
		ExtentTest t3 = rp.createTest("Login 3");
		t1.pass("Login success");
		t1.pass("Gogged successfully");
		t1.pass("oreder successs");
		t1.pass("logged ot");
		t2.fail("Account login", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\vijay\\OneDrive\\Desktop\\My_Pic.jpg").build());
		
		t3.skip("Payment ");
		rp.flush();
	}
	
}
