package practise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IccWebTable {

	public static void main(String[] args) {
//		WebDriver driver=WebDriverManager.chromedriver().create();
		WebDriverManager.firefoxdriver().setup();
		WebDriver	driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> element = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		ArrayList<String> al=new ArrayList<String>();
		for(WebElement name:element) {
			al.add(name.getText());
		}
		System.out.println("team"+"				"+"Rating");
		for(String teams:al) {
			String rating="//span[.='"+teams+"']/../following-sibling::td[3]";
			String rat=driver.findElement(By.xpath(rating)).getText();
			System.out.println(teams+"				"+rat);
		}
		driver.close();
	}
}
