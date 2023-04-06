package practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericUtilities.ExcelUtility;

public class ReadMultipleSetDataFromExcel {
	@Test(dataProvider = "readSetOfData")
	public void getData(String src,String dest,String location) {
		System.out.println("source "+src+" destination "+dest+" Location "+location);
	}
	
	@DataProvider
public Object[][] readSetOfData() throws Throwable {
	ExcelUtility elib=new ExcelUtility();
	Object[][] value = elib.ReadSetOfData("Sheet1");
	return value;
}
}
