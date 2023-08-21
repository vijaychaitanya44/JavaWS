package head;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-2113679551%3A1685047072520184&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=Af_xneFH4qbaDkMMSTFjbPbj7-Uujdhd0VIlsIq5kNbWz54KSSuGP1xfG04uCcTiH-tJIO6ik9npTA&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
	
		

	}

}
