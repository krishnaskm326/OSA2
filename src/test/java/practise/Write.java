package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write {

	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the data count");
		int n=sc.nextInt();		
		FileInputStream fis=new FileInputStream(".//src/test/resources/exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		System.out.println("enter the "+n+" cell values");
		Sheet sh = wb.getSheet("Sheet1");
		for(int i=0;i<=n-1;i++) {
			String data=sc.next();
			sh.getRow(i).getCell(0).setCellValue(data);
		}
		FileOutputStream fos=new FileOutputStream(".//src/test/resources/exceldata.xlsx");
		wb.write(fos);			
		wb.close();
	}
	}


