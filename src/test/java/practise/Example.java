package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.FileUtility;
import com.GenericUtilities.WebDriverUtility;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.MycartPage;
import com.ObjectRepository.SigninPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		FileUtility fLib = new FileUtility();
		WebDriverUtility wLib = new WebDriverUtility();
	    ExcelUtility eLib = new ExcelUtility();
		wLib.maximizeWindow(driver);
		wLib.waitFOrPageLoad(driver);
		
		String url = fLib.readDataFromPropertyFile("User_URL");
		String userName = fLib.readDataFromPropertyFile("User_un");
		String password = fLib.readDataFromPropertyFile("User_pwd");
		driver.get(url);
		MycartPage mc=new MycartPage(driver);
		HomePage hp=new HomePage(driver);
		hp.clkLoginBtn();
		SigninPage sp=new SigninPage(driver);
		sp.userSignIn(userName, password);
		
		hp.MyAccountbtn();
		
	}

}
