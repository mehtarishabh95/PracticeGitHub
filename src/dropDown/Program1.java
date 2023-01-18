package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dropdown);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("search-alias=todays-deals");
		Thread.sleep(2000);
		s.selectByVisibleText("Deals");
	    List<WebElement> options = s.getOptions();
	    System.out.println(options.size());
	    for(WebElement b:options)
	    {
	    	System.out.println(b.getText());
	    }
		
		driver.close();

	}

}
