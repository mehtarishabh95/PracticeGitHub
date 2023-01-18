package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbImplicitlyWait {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	driver.findElement(By.id("email")).sendKeys("9782045063");
	 	driver.findElement(By.id("pass")).sendKeys("kamesh22");
	 	driver.findElement(By.name("login")).click();


	}

}
