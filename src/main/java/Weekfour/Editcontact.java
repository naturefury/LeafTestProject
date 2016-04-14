package Weekfour;

import org.junit.Test;

import Week.Wrapperclass;

public class Editcontact extends Wrapperclass {
	
	@Test
	public void launch() throws InterruptedException
	{
		
		launchapp("chrome","http://demo1.opentaps.org/");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		Thread.sleep(2000);
		clickByLinkText("Create Contact");
		
		//create contact
		enterById("firstNameField", "contactone");
		enterById("lastNameField", "last");
		enterById("createContactForm_primaryPhoneNumber", "9999999991");
		clickByName("submitButton");
		System.out.println("Record has been created");
		
		//edit contact info
		
		clickByXpath("//a[text()='Edit']");
		enterById("updateContactForm_lastName", "editedlastname");
		enterById("updateContactForm_firstNameLocal", "updatedlastnme");
		enterById("updateContactForm_lastNameLocal", "updatedfirst");
		clickByName("submitButton");		
		System.out.println("Record has been updated sucessfully");
		
		
		
		//find and delete
		
		clickByLinkText("Find Contacts");
		//Navigate to find page by ph no-xpth
		clickByXpath("//span[text()='Phone']");
		
		//entering the phonenumber
		enterByXpath("((//label[text()='Phone Number:'])[4]/following::input)[3]","9999999991");
		
		//clicking the find button

		clickByXpath("//button[text()='Find Contacts']");
		
		
		//
		Thread.sleep(2000);
		//fetching the first link value
		String a1=getLinkText("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		//System.out.println(a1);
		//clicking the first link
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		//deleting the record
		clickByLinkText("Deactivate Contact");
		acceptAlert();
				
		// For verifying the Phone number has been deleted or not
		clickByLinkText("Find Contacts");
		
		//cross verifying the record has been deleted
		//Navigate to find page by ph no-xpth
		clickByXpath("//span[text()='Phone']");
		
		//navigate to the phone textbox & entering hte value
		enterByXpath("((//label[text()='Phone Number:'])[4]/following::input)[3]","9999999991");
		
		//click the find button

		clickByXpath("//button[text()='Find Contacts']");
		Thread.sleep(2000);
		//Boolean veri=VerifyLinkText("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		//System.out.println(veri);
		String b="null";
		 b=getLinkText("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		

		//System.out.println(b);
			if(a1.contentEquals(b))
			{
		System.out.println("Duplicate record exists");
			}
			else
			{
				System.out.println("Record has been deleted with id "+a1);
			}
		
		
			
			//Merge contact
			
			clickByLinkText("Merge Contacts");
			clickByXpath("//*[@id='partyIdFrom']/parent::*/a/img");
			switchToPrimaryWindow();
			Thread.sleep(3000);
			dimissAlert();
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
			dimissAlert();
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
