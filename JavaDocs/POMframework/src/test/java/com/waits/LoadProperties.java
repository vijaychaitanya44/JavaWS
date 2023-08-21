package com.waits;

import java.io.FileReader;
import java.nio.file.NoSuchFileException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

public class LoadProperties {

	private final String propFile = "D:\\Eclipse WS\\Interview_Prep\\POMframework\\src\\test\\resources\\avis.properties";
	public static final String BROWSER="browser";
	public static final String LOGIN_KEY="loginKey";
	public static final String URL="url";
	private static FileReader fr;
	private static Properties pr = new Properties();
	
	private String browser = null;
	private String loginKey =null;
	private String url =null;
	//public final Logger = LogFactory.getLogger(getClass());
	public void loadFile(String properties) {

		try {
			fr = new FileReader(properties);
			pr.load(fr);
			loadValues();
		} catch (Exception e) {
			System.out.println("No file preseent exception " + e);
		}

	}
	
	public String get(String key) {
		if(pr.contains(key)){
			return pr.getProperty(key);
		}
		return null;
	}
	
	
	public void loadValues() {
		loginKey= pr.getProperty(LOGIN_KEY);
		System.out.println(loginKey);
		browser= pr.getProperty(BROWSER);
		System.out.println(browser);
		url = pr.getProperty(URL);
		System.out.println(url);
	}
	
	@BeforeTest
	public void loadProp() {
		 
	}
}
