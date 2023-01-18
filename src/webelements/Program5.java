package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		WebElement ele = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
		if(ele.isSelected())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.close();

	}

}
