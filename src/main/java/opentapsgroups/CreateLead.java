package opentapsgroups;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends OpenTapsWrapper {
	
	
	@Test(groups="smoke",dataProvider="testdata")
	public void createlead(String test1,String test2,String test3,String test4,String test5)
	{
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);
		System.out.println(test5);
		System.out.println("Lead created");
	}
	
	@DataProvider(name="testdata")
	public Object[][] createleads(){
		
		Object[][] data = new Object[2][5];
		data[0][0] = "Babu";
		data[0][1] = "test1234";
		data[0][2] = "AMT";
		data[0][3] = "dk";
		data[0][4] = "test";
		data[1][0] = "Babu";
		data[1][1] = "test1234";
		data[1][2] = "amt";
		data[1][3] = "gopi";
		data[1][4] = "test";
		
		return data;
		
	}

}
