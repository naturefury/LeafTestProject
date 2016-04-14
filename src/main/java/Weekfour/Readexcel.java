package Weekfour;

import java.io.IOException;

import org.junit.Test;

import Week.Testttt;

public class Readexcel extends Testttt {
	
	@Test
	public void remove() throws InterruptedException, IOException{
	//getting input from the excel sheet	
	String a=readCellFromExcel("TC_03",1,3);
	String username=readCellFromExcel("TC_03",1,1);
	String password=readCellFromExcel("TC_03",1,2);
	//System.out.println(a);
	//System.out.println(username);
	//System.out.println(password);
	//opening the browser and entering username & password
	loginOpenTaps("chrome",username,password);
	//clikcing the CRM link
	clickByXpath("//*[@id='button']/a");
	//clikcing the create lead functionlity
	clickByLinkText("Create Lead");
	
	//clicking find lead functionality
	clickByLinkText("Find Leads");
	//Navigate to find page by ph no-xpth
	clickByXpath("//span[text()='Phone']");
	
	//entering the phonenumber
	enterByXpath("((//label[text()='Phone Number:'])[4]/following::input)[3]",a);
	
	//clicking the find button

	clickByXpath("//button[text()='Find Leads']");
	
	
	//
	Thread.sleep(2000);
	//fetching the first link value
	String a1=getLinkText("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	//System.out.println(a1);
	//clicking the first link
	clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	
	//deleting the record
	clickByLinkText("Delete");
	//
	
	
	// For verifying the Phone number has been deleted or not
	clickByLinkText("Find Leads");
	
	//cross verifying the record has been deleted
	//Navigate to find page by ph no-xpth
	clickByXpath("//span[text()='Phone']");
	
	//navigate to the phone textbox & entering hte value
	enterByXpath("((//label[text()='Phone Number:'])[4]/following::input)[3]",a);
	
	//click the find button

	clickByXpath("//button[text()='Find Leads']");
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
	}
	
}

	
	





