package head;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverDemo {
	public static final Logger log = LogManager.getLogger(DriverDemo.class);
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		log.info("opened browser");
		
		driver.get("www.youtube.com");
		log.info("opened ");
		
		
	}
	
	
	
		

	
	
	
	
	
	

}
