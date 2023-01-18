package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test1
{
	@FindBy(id="email")
	private WebElement facebookUN;
	@FindBy(id="pass")
	private WebElement facebookpwd;
	@FindBy(name="login")
	private WebElement facebookloginbtn;
	
	public Test1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void facebookUN(String un)
	{
		facebookUN.sendKeys(un);
	}
	public void facebookPWD(String pwd)
	{
		facebookpwd.sendKeys(pwd);
	}
	public void facebookLoginButton()
	{
		facebookloginbtn.click();
	}
	
	
}
