package practise;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screeshot {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("http://rmgtestingserver/domain/Online_Shopping_Application/category.php?cid=231");
TakesScreenshot sc=(TakesScreenshot) driver;
File src=sc.getScreenshotAs(OutputType.FILE);
File dest=new File("./src/test/resources/scn1.png");
FileUtils.copyFile(src, dest);

	}

}
