package practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDatainExcel {

	public static void main(String[] args) throws Throwable{
FileInputStream fis=new FileInputStream(".//src/test/resources/exceldata.xlsx");
Workbook wb=WorkbookFactory.create(fis);
wb.getSheet("Sheet1").getRow(4).getCell(0).setCellValue("good");
FileOutputStream fos=new FileOutputStream(".//src/test/resources/exceldata.xlsx");
wb.write(fos);
wb.close();
	}

}
