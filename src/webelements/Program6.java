package webelements;

import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program6 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mob");
		Thread.sleep(3000);
		 List<WebElement> ele1 = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		 System.out.println(ele1.size());
		 for(WebElement b:ele1)
		 {
			 System.out.println(b.getText());
		 }
		 driver.close();
	}

}
