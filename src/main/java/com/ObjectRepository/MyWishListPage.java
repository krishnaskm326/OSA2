package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishListPage {

	@FindBy(xpath = "(//a[contains(text(),'Add to cart')])[1]")
	private WebElement clkAddToCartBtn;

	public WebElement getClkAddToCartBtn() {
		return clkAddToCartBtn;
	}

	public MyWishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clkAddToCartBtn() {
		clkAddToCartBtn.click();
	}
}
