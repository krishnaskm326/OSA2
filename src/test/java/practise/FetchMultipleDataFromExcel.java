package practise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcel {

	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis=new FileInputStream(".//src/test/resources/exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int count=wb.getSheet("Sheet1").getLastRowNum();
		for(int i=1;i<=count;i++) {
			String orga=wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			String loc=wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			System.out.println(orga+" "+loc);
		}
		}

}
