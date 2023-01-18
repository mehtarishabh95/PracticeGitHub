package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 
{
	@Test (priority=1)
public void chats()
{
	Reporter.log("chats",true);

}
@Test
public void calls()
{
	Reporter.log("calls",true);
	
}
@Test(priority=1)
public void bhadmejao()
{
	Reporter.log("bhad me jao",true);

}
}
