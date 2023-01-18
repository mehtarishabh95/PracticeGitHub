package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbExplicitlyWait {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
	 	  WebElement user = driver.findElement(By.id("email"));
	 	w.until(ExpectedConditions.visibilityOf(user)).sendKeys("9782045063");
	 	
	 	WebDriverWait x=new WebDriverWait(driver,Duration.ofSeconds(10));
	 	WebElement pwd = driver.findElement(By.id("pass"));
	 	x.until(ExpectedConditions.visibilityOf(pwd)).sendKeys("kamesh22");
	 	
	 	WebDriverWait z=new WebDriverWait(driver,Duration.ofSeconds(10));
	 	WebElement login = driver.findElement(By.name("login"));
	 	z.until(ExpectedConditions.elementToBeClickable(login)).click();

	}

}
