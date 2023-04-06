package osa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Olympics {

	public static void main(String[] args) {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		List<WebElement> medals = driver.findElements(By.xpath("//section/section[3]/div[1]/div[3]/div/span[1]"));
		for(WebElement olympics:medals) {
			
				System.out.println(olympics.getText());
	}}

}
