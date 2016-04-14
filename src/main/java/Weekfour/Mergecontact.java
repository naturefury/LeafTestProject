package Weekfour;

import org.junit.Test;

import Week.Wrapperclass;

public class Mergecontact extends Wrapperclass {
	@Test
	public void test() throws Exception
	{
		
		launchapp("firefox","http://demo1.opentaps.org/");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		Thread.sleep(2000);
		clickByLinkText("Create Contact");
		
		//Merge contact
		
		clickByLinkText("Merge Contacts");
		clickByXpath("//*[@id='partyIdFrom']/parent::*/a/img");
		switchToPrimaryWindow();
		Thread.sleep(3000);
		//dimissAlert();
		clickByXpath("//span[text()='Name and ID']");
		
		//entering the phonenumber
		enterByXpath("//label[text()='Contact Id:']/parent::*/div/input","10024");
		
		//clicking the find button

		clickByXpath("//button[text()='Find Contacts']");
		
		Thread.sleep(2000);
		
		//clicking the first link
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		
		//second contact
		
		clickByXpath("//*[@id='partyIdTo']/parent::*/a/img");
		switchToPrimaryWindow();
		Thread.sleep(3000);
		//dimissAlert();
		clickByXpath("//span[text()='Phone']");
		
		//entering the phonenumber
		enterByXpath("//label[text()='Phone Number:']/parent::*/div/div/div/table/tbody/tr/td[3]/div/div/div/input","9999999991");
		
		//clicking the find button

		clickByXpath("//button[text()='Find Contacts']");
		
		Thread.sleep(2000);
		
		//clicking the first link
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		clickByLinkText("Merge");
		acceptAlert();
		
	}

}
