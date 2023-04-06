package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RmgTY {

	public static void main(String[] args) throws Throwable {
		String p_name = "OSA1";try {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://rmgtestingserver:8084/");
driver.findElement(By.name("username")).sendKeys("rmgyantra");
driver.findElement(By.name("password")).sendKeys("rmgy@9999");
driver.findElement(By.xpath("//button[text()='Sign in']")).click();
driver.findElement(By.xpath("//a[.='Projects']")).click();
driver.findElement(By.xpath("//span[.='Create Project']")).click();
driver.findElement(By.name("projectName")).sendKeys(p_name);
driver.findElement(By.name("createdBy")).sendKeys("krishnamoorthi");
//driver.findElement(By.name("status")).click();
WebElement element = driver.findElement(By.xpath("(//select[@name='status'])[2]"));
Select s = new Select(element);
s.selectByVisibleText("On Gogin");
driver.findElement(By.xpath("//input[@type='submit']")).click();
Connection con=null;
Driver driver1=new Driver();
DriverManager.registerDriver(driver1);
con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
Statement state = con.createStatement();
String query = "select * from project;";
ResultSet result=state.executeQuery(query);
boolean flag = false;
while(result.next()) {
	String data = result.getString(4);
	System.out.println(data);
	if(p_name.contains("data"))
	{
		flag=true;
		break;
	}
	if(flag) {
		System.out.println("project created");
	}
}}
	catch (Exception e) {

	}
	finally {
		System.out.println("----ok-----");
	}

}}
