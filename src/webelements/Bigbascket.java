package webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bigbascket {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/?nc=logo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("input"));
		ele.sendKeys("see");
		
		Thread.sleep(3000);
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='container-fluid ng-scope']"));
		System.out.println(ele1.size());
		
		for( WebElement b:ele1)
		{
			System.out.println(b.getText());
		}
		driver.close();
	}

}
