package Week;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wbook=new XSSFWorkbook();
		XSSFSheet sheet=wbook.createSheet("gopi");
		XSSFRow row=sheet.createRow(0);
		row.createCell(1).setCellValue("gopinth");
		
		sheet.createRow(1).createCell(0).setCellValue("cloumntest");
		
		FileOutputStream file=new FileOutputStream(new File("D:\\Testleafhome\\Work\\data\\testcase01.xlsx"));
		wbook.write(file);
		wbook.close();
		file.close();
	}

}
