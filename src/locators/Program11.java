package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program11 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.name("q"));
	   Point loc = ele.getLocation();
	   System.out.println(loc.getX()+"x");
	   System.out.println(loc.getY()+"y");
	   driver.close();
	}

}
