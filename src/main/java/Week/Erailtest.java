package Week;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class Erailtest extends Wrapperclass {
	
	@Test
	public void erail() throws InterruptedException, IOException{
		int i=0;
		launchapp("chrome","http://erail.in/");
		enterByIdandtab("txtStationFrom","mas");
		enterByIdandtab("txtStationTo","SBC");
		selectValueByIndex("cmbQuota", 1);
		selectValueByIndex("selectClassFilter",0);
		clickById("buttonFromTo");
		Thread.sleep(3000);
	
	XSSFWorkbook wbook=new XSSFWorkbook();
	XSSFSheet sheet=wbook.createSheet();
	//number of rows we want to print from the table
	for(int k=0;k<=20;)
	{
	XSSFRow row=sheet.createRow(k);
	//value j for the row initialization
	int j=0;
	//Initializing the incremental value for the xpath(coulmn data)
	for(i=1;i<=20;)
	{
		//for the first row as heading
		if(k==0)
		{
	String a=getLinkText("//table[@class='DataTable DataTableHeader TrainList']/tbody/tr/td["+i+"]");
	do{
		//System.out.println(j);
		
		row.createCell(j).setCellValue(a);
	
	}while(j>19);

	}
		//fo rthe rest of the rows
		else
		{
			//System.out.println(i);
			String b=getLinkText("//table[@class='DataTable TrainList']/tbody/tr["+k+"]/td["+i+"]");
			//System.out.println(b);
			
			do{
				//System.out.println(j);
				
				row.createCell(j).setCellValue(b);
			
			}while(j>19);
		}
		
		j=j+1;
		i=i+1;
	}
	
		
	k=k+1;
	}
	//row.createCell(1).setCellValue("gopi");
	FileOutputStream file=new FileOutputStream(new File("D:\\Testleafhome\\Work\\data\\etrain.xlsx"));
	
	wbook.write(file);
	wbook.close();
	file.close();

}

}