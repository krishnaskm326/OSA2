package practise;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import com.GenericUtilities.IpathConstants;

public class Dp_test2 {

	@DataProvider
	public Object[][] data() throws Throwable 
	{
		FileInputStream fis = new FileInputStream(IpathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=  wb.getSheet("Sheet1");
		int lastRow=sh.getLastRowNum()+1;
		int lastCell=sh.getRow(0).getLastCellNum();
		Object[][] obj=new Object[lastRow][lastCell];
		for(int i=0;i<lastRow;i++) {
			for(int j=0;j<lastCell;j++) {
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return obj;
		
	}
}
