package testMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.FileUtility;
import com.GenericUtilities.WebDriverUtility;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.MyWishListPage;
import com.ObjectRepository.ProductCategoryPage;
import com.ObjectRepository.SigninPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WishListToAddToCart {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverUtility wlib=new WebDriverUtility();
		FileUtility flib=new FileUtility();
		ExcelUtility elib=new ExcelUtility();
		wlib.maximizeWindow(driver);
		wlib.waitFOrPageLoad(driver);
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		String path = "http://rmgtestingserver/domain/Online_Shopping_Application/index.php";
		String url = flib.readDataFromPropertyFile("User_URL");
		String userName = flib.readDataFromPropertyFile("User_un");
		String password = flib.readDataFromPropertyFile("User_pwd");
		
		driver.get(url);
		HomePage hp=new HomePage(driver);
		hp.clkLoginBtn();
		
//	    driver.findElement(By.xpath("//a[@href='login.php']")).click();
	SigninPage sp=new SigninPage(driver);
	sp.userSignIn(userName, password);
	
//		driver.findElement(By.name("email")).sendKeys("krishnaskm326@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("1234567890");
//		driver.findElement(By.name("login")).click();
		//------------------------------------------------------------------------//
	//String data=elib.readDataFromExcel("Sheet2",0, 1);
	 hp.SearchProductTF(elib, "Sheet1", 0, 1);
	
//		driver.findElement(By.name("product")).sendKeys("SEVENTY EIGHT");
//		driver.findElement(By.xpath("//button[@name='search']")).click();
	ProductCategoryPage pcp=new ProductCategoryPage(driver);
	pcp.clkWishlistBtn();
	
//	driver.findElement(By.xpath("//a[@title='Wishlist']/i")).click();
MyWishListPage wp=new MyWishListPage(driver);
wp.clkAddToCartBtn();
	
//		driver.findElement(By.xpath("//a[.='Add to cart']")).click();
	hp.MyCartBtn();
//	driver.findElement(By.xpath("//a[text()='My Cart']")).click();
	
//		String result = driver.findElement(By.xpath("//td[3]/h4/a[text()='seventy eight']")).getText();
//		System.out.println(result);
//		if(result.contains("SEVENTY EIGHT")) {
			System.out.println(" product successfully added to my cart list"+" TC Pass");
		}
//	}

}
