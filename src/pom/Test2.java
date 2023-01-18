package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test2
{
	
	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="pass")
	public WebElement password;
	
	@FindBy(name="login")
	public WebElement loginbutton;
	
	public Test2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username()
	{
		username.sendKeys("9782045063");
	}
	public void password()
	{
		password.sendKeys("kamesh22");
	}
	public void loginbutton()
	{
		loginbutton.click();
	}
}
