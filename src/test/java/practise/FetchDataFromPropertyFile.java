package practise;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDataFromPropertyFile 
{
	public static void main(String[] args) throws Throwable  
	{
FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commondata.property");
Properties obj=new Properties();
obj.load(fis);
String url=obj.getProperty("URL");
String user_un=obj.getProperty("user_un");
String user_pwd=obj.getProperty("user_pwd");
System.out.println(url);
System.out.println(user_un);
System.out.println(user_pwd);
	
WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.findElement(By.name("email")).sendKeys(user_un);
	driver.findElement(By.name("password")).sendKeys(user_pwd);
	driver.findElement(By.name("login")).click();
	
	}
}