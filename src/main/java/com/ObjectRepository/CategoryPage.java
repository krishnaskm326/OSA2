package com.ObjectRepository;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericUtilities.ExcelUtility;

public class CategoryPage {
	@FindBy(name="category")
	private WebElement categoryTF;
	@FindBy(name="description")
	private WebElement  descriptionTF;
	@FindBy(name="submit")
	private WebElement clkCreateBtn;
	public CategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getCategoryTF() {
		return categoryTF;
	}
	public WebElement getDescriptionTF() {
		return descriptionTF;
	}
	public WebElement getClkCreateBtn() {
		return clkCreateBtn;
	}
	
	public String createCategoryTF(ExcelUtility eLib,WebDriver driver) throws Throwable {
		String categName=null;
		HashMap<String, String> map = eLib.readmultipleDataFromExcel("Sheet1");
		for(Entry<String,String> set:map.entrySet()) {
			if(set.getKey().equalsIgnoreCase("categoryName")) {
				categName=set.getValue();
				driver.findElement(By.name(set.getKey())).sendKeys(categName);
			}
			else {
				driver.findElement(By.name(set.getKey())).sendKeys();
			}
		}
		clkCreateBtn.click();
		return categName;
	}
	
	
}
