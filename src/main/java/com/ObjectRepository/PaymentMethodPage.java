package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodPage {

	@FindBy(xpath = "//input[@value='COD']")
	private WebElement clkCODPaymentOptions;
	@FindBy(xpath = "//input[@value='Internet Banking']")
	private WebElement clkInternetBankingOptions;
	@FindBy(xpath = "//input[@value='Debit / Credit card']")
	private WebElement clkDebitCardOptions;
	@FindBy(name = "submit")
	private WebElement clkSubmitBtn;
	public WebElement getClkCODPaymentOptions() {
		return clkCODPaymentOptions;
	}
	public WebElement getClkInternetBankingOptions() {
		return clkInternetBankingOptions;
	}
	public WebElement getClkDebitCardOptions() {
		return clkDebitCardOptions;
	}
	public WebElement getClkSubmitBtn() {
		return clkSubmitBtn;
	}
	
	public PaymentMethodPage(WebDriver driver) {
       	PageFactory.initElements(driver, this);
           }
	public void clkCODPaymentOptions() {
		clkCODPaymentOptions.click();
	}
	public void clkInternetBankingOptions() {
		clkInternetBankingOptions.click();
	}
	public void clkDebitCardOptions() {
		clkDebitCardOptions.click();
	}
	public void clkSubmitBtn() {
		clkSubmitBtn.click();
	}
	
	
}
