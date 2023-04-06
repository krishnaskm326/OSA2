package com.GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ObjectRepository.HomePage;
import com.ObjectRepository.SigninPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	
		public	WebDriverUtility wLib=new WebDriverUtility();
		public	FileUtility fLib=new FileUtility();
		public	ExcelUtility eLib=new ExcelUtility();
		public	DatabaseUtility dbLib=new DatabaseUtility();
			public WebDriver driver;
//					@BeforeSuite(groups =  {"smoke","regression"})
//						public void connectToDB() throws Throwable {
//						dbLib.connectToDb();
//								}
//									@Parameters("BROWSER")
									@BeforeClass(groups =  {"smoke","regression"})
						public void openTheBrowser() throws Throwable {
					String BROWSER = fLib.readDataFromPropertyFile("browser");
					String URL = fLib.readDataFromPropertyFile("User_URL");
					if(BROWSER.equalsIgnoreCase("chrome")) {
						WebDriverManager.chromedriver().setup();
						driver=new ChromeDriver();
					}
					else if (BROWSER.equalsIgnoreCase("firefox")) {
						WebDriverManager.firefoxdriver().setup();
						driver=new FirefoxDriver();
					}
					else {
						WebDriverManager.iedriver().setup();
						driver = new InternetExplorerDriver();
					}
					wLib.maximizeWindow(driver);
					driver.get(URL);
					wLib.waitFOrPageLoad(driver);
					}
					@BeforeMethod(groups =  {"smoke","regression"})
						public void userLogin() throws Throwable {
						HomePage hp = new HomePage(driver);
						hp.clkLoginBtn();
						SigninPage sp = new SigninPage(driver);
						String USERNAME = fLib.readDataFromPropertyFile("Admin_un");
						String PASSWORD = fLib.readDataFromPropertyFile("Admin_pwd");
						sp.userSignIn(USERNAME,PASSWORD);
					}
					
					@AfterMethod(groups =  {"smoke","regression"})
						public void userLogout() {
						HomePage hp=new HomePage(driver);
						hp.clkLogOutBtn();
					}
					@AfterClass(groups =  {"smoke","regression"})
						public void closeTheBrowser() {
						driver.quit();
					}
//					@AfterSuite(groups =  {"smoke","regression"})
//						public void closeDbConnection() throws Throwable {
//						dbLib.closeDb();
//					}

	
}
