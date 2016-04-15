package Week;

import java.io.IOException;

import org.junit.Test;



public class ReadExcelTaps extends Wrapperclass {
	
	@Test
	public void remove() throws InterruptedException, IOException{
	//getting input from the excel sheet	
	String a=readCellFromExcel("TC_03",1,3);
	String username=readCellFromExcel("TC_03",1,1);
	String password=readCellFromExcel("TC_03",1,2);
	System.out.println(a);
	System.out.println(username);
	System.out.println(password);
	//opening the browser and entering username & password
	
	
	
	}
}

	
	





