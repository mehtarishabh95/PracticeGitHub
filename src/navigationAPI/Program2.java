package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.google.com/search?q=new+style&gs_ivs=1#tts=0");
		driver.getWindowHandle();

	}

}
