package opentapsgroups;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class OpenTapsWrapper {
	@Parameters("browser")
	@BeforeClass
	public void launch(String browser1)
	{
	System.out.println(browser1 +"  Browser launched");
	
	}
	@AfterClass
	public void closebrowser()
	{
	System.out.println("Close Browser");
	
	}
	@BeforeMethod
	public void login()
	{
	System.out.println("Login + Click CRM + Click");
	
	}
	
}
