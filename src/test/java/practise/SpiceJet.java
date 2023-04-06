package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div/div[2]/div[1][contains(text(),'one way')]"));
		driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[2]/input[@value and @type='text'][1]")).sendKeys("bengaluru");
				}

}
