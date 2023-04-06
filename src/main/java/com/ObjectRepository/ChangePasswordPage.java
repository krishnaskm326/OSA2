package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {
	@FindBy(xpath = "//a[@href='category.php']")
	private WebElement clkCategoryBtn;
	@FindBy(xpath = "//a[@href='subcategory.php']")
	private WebElement clkSubCategoryBtn;
	@FindBy(xpath = "//a[@href='insert-product.php']")
	private WebElement clkInsertProductBtn;
public ChangePasswordPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	public WebElement getClkSubCategoryBtn() {
		return clkSubCategoryBtn;
	}

	public WebElement getClkInsertProductBtn() {
		return clkInsertProductBtn;
	}

	public void clkSubCategoryBtn() {
			clkSubCategoryBtn.click();
	}

	public void lkInsertProductBtn() {
		clkInsertProductBtn.click();
	}

	public WebElement getClkCategoryBtn() {
		return clkCategoryBtn;
	}

	public void clkCategoryBtn() {
		clkCategoryBtn.click();
	}
	
}
