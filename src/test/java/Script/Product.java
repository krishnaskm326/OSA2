package Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.FileUtility;
import com.GenericUtilities.WebDriverUtility;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.ProductCategoryPage;
import com.ObjectRepository.SigninPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Product {

	public static void main(String[] args) throws Throwable {
		FileUtility fLib = new FileUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		wLib.maximizeWindow(driver);
		wLib.waitFOrPageLoad(driver);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		String path = "http://rmgtestingserver/domain/Online_Shopping_Application/index.php";
		String url = fLib.readDataFromPropertyFile("User_URL");
		String userName = fLib.readDataFromPropertyFile("User_un");
		String password = fLib.readDataFromPropertyFile("User_pwd");
		
		driver.get(url);
		
////1.verify navigate to apps 
//		String title1 = driver.getTitle();
//		if(title1.contains("Home")) {
//		System.out.println("1.home page displayed");
//		}
	HomePage hp=new HomePage(driver);
	hp.clkLoginBtn();
	
//		driver.findElement(By.xpath("//a[@href='login.php']")).click();
//2.verify navigate to apps 
//				String title2 = driver.getTitle();
//				if(title2.contains("Sign")) {
//				System.out.println("2.signin page displayed");
//				}
	SigninPage sp=new SigninPage(driver);
	sp.userSignIn(userName, password);
//		driver.findElement(By.name("email")).sendKeys(userName);
//		driver.findElement(By.name("password")).sendKeys(password);
//		driver.findElement(By.name("login")).click();
// 3.verify login
//		String title3 = driver.getTitle();
//		if(title3.contains("My Cart")) {
//			System.out.println("3.my cart page displayed");
//		}
	hp.clkCategory();
//		driver.findElement(By.xpath("//a[.=' womens']")).click();
// 4.verify category
//		String title4 = driver.getTitle();
//		if(title4.contains("Product")) {
//			System.out.println("4.product category page displayed");
//		}
	ProductCategoryPage pcp=new ProductCategoryPage(driver);
	pcp.clkSubCategoryTshirts();
	
//		driver.findElement(By.xpath("//a[contains(text(),'t-shirts')]")).click();
// 5.verify sub-category
//				String title5 = driver.getTitle();
//				if(title5.contains("Product")) {
//					System.out.println("5.product category page displayed");
//				}
	pcp.clkProduct();
	
//		driver.findElement(By.xpath("//a/img[1]")).click();
//6.verify product details
//		String title6 = driver.getTitle();
//		if(title6.contains("Product")) {
//			System.out.println("TC Result: product details page displayed");
//		}
//7.verify logout
	hp.clkLogOutBtn();
//		driver.findElement(By.xpath("//a[@href='logout.php']")).click();
		String result = driver.getTitle();
		if(result.contains("Home")) {
			System.out.println(result+" TC pass");
		}
		Thread.sleep(300);
		driver.close();
	}

}
