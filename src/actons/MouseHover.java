package actons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	private static final WebElement Shop = null;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://luxire.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement shop = driver.findElement(By.xpath("//button[@class='drawerbtn']"));

		Actions a= new Actions(driver);
		a.moveToElement(shop).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='All Shirts'])[2]")).click();
		
		

	}

}
