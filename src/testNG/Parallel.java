package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel 
{
	public WebDriver driver;
	@Parameters({"browserName"})
	@Test
	public void tc1(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else
		{
			driver= new FirefoxDriver();
		
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9782045063");
		driver.findElement(By.id("pass")).sendKeys("avafaf");
		driver.findElement(By.name("login")).click();
		Reporter.log(driver.getCurrentUrl(),true);
		Reporter.log(driver.getTitle(),true);
	}

}
