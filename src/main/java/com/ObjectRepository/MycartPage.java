package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MycartPage {

	

	@FindBy(xpath = "//a[.='Home']")
	private WebElement homeBtn;
	
	@FindBy(name="remove_code[]")
	private WebElement removeProductFromMyCart;
	
	@FindBy(xpath = "//td/div/input[@type='text']")
			private WebElement UpdateQquatity;
	
	@FindBy(name="ordersubmit")
			private WebElement clkCheckOutBtn;
	@FindBy(name = "billingaddress")
	private WebElement billAddress;
	@FindBy(name = "bilingstate")
	private WebElement billState;
	@FindBy(name = "billingcity")
	private WebElement billCity;
	@FindBy(name = "billingpincode")
	private WebElement billPinCode;
		@FindBy(name = "update")
	private WebElement clkUpdateBtn;
		
	
	
	public WebElement getRemoveProductFromMyCart() {
			return removeProductFromMyCart;
		}

		public WebElement getUpdateQquatity() {
			return UpdateQquatity;
		}

		public WebElement getClkCheckOutBtn() {
			return clkCheckOutBtn;
		}

		public WebElement getBillAddress() {
			return billAddress;
		}

		public WebElement getBillState() {
			return billState;
		}

		public WebElement getBillCity() {
			return billCity;
		}

		public WebElement getBillPinCode() {
			return billPinCode;
		}

		public WebElement getClkUpdateBtn() {
			return clkUpdateBtn;
		}

	public WebElement getHomeBtn() {
		return homeBtn;
	}
	public MycartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void removeProductFromMyCart() {
		removeProductFromMyCart.click();
	}

	public void updateQquatity() {
	UpdateQquatity.click();
	}

	public void clkCheckOutBtn() {
		clkCheckOutBtn.click();
	}
public void changeBillingAddress(String address,String state,String city,String pinCode) {
	billAddress.sendKeys(address);
	billState.sendKeys(state);
	billCity.sendKeys(city);
	billPinCode.sendKeys(pinCode);
	clkUpdateBtn.click();
}

	public void clkHomeBtn() {
		homeBtn.click();
	}
}
