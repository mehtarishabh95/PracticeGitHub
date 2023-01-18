package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s=new Select(dropdown);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.selectByValue("500");
		Thread.sleep(2000);
		
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByIndex(1);
		Thread.sleep(2000);
		s.deselectByIndex(2);
		Thread.sleep(2000);
		s.deselectByIndex(3);
		Thread.sleep(2000);
		s.deselectByIndex(4);
		Thread.sleep(2000);
		s.deselectByValue("500");
		Thread.sleep(2000);
		

	}

}
