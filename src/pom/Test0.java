package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Test1 tc1= new Test1(driver);
		 tc1.facebookUN("9782045063");
		 tc1.facebookPWD("kamesh22");
		 tc1.facebookLoginButton();
		
		
	}
}
