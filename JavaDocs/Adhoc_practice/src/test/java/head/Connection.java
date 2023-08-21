package head;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Connection {


	
	private static WebDriver driver;
	
	private Connection() {
		
	}
	
	
	
	public static WebDriver getDriver() {
		//driver = new ChromeDriver();
		return driver;
		
	}
	
	public static void main(String[]a) {
		
		
	//Connection con = Connection.getDriver();
	
	
	}
	
}
