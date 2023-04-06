package practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Write2 {

	public static void main(String[] args) throws Throwable {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the c1 data counts");
		int n=sc.nextInt();		
		FileInputStream fis=new FileInputStream(".//src/test/resources/exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		System.out.println("enter the "+n+" cell values");
		Sheet sh = wb.createSheet("Sheeta");
		System.out.println("1 column");
		for(int i=0;i<n;i++) {
			String data1=sc.next();
			sh.createRow(i).createCell(0).setCellValue(data1);
		}
		System.out.println("enter the c2 data counts");
		int m=sc.nextInt();
				for(int j=0;j<m;j++) {
			String data2=sc.next();
			sh.getRow(j).createCell(1).setCellValue(data2);
			
		}
		FileOutputStream fos=new FileOutputStream(".//src/test/resources/exceldata.xlsx");
		wb.write(fos);			
		wb.close();
	}
	}