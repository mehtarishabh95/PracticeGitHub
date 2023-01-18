package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program3 {

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
		s.selectByValue("500");
		Thread.sleep(2000);
		s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		List<WebElement> options = s.getAllSelectedOptions();
		for(WebElement b:options)
		{
			System.out.println(b.getText());
		}

	}

}
