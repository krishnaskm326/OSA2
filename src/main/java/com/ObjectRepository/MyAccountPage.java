package com.ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.WebDriverUtility;

public class MyAccountPage {

	@FindBy(xpath = "//a[@href=\"bill-ship-addresses.php\"]")
	private WebElement clkShipBillAddressbtn;
	
	WebDriverUtility wLib=new WebDriverUtility();

	@FindBy (name="billingaddress")
	private WebElement billAddressTF;
	@FindBy(name = "bilingstate")
	private WebElement billStateTF;
	@FindBy(name = "billingcity")
	private WebElement billCityTF;
	@FindBy(name = "billingpincode")
	private WebElement billPinCodeTF;
	@FindBy(name = "update")
	private WebElement clkUpdateBtn;
	
	public MyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getBillAddressTF() {
		return billAddressTF;
	}

	public WebElement getBillStateTF() {
		return billStateTF;
	}

	public WebElement getBillCityTF() {
		return billCityTF;
	}

	public WebElement getClkShipBillAddressbtn() {
		return clkShipBillAddressbtn;
		}

	public WebElement getBillPinCodeTF() {
		return billPinCodeTF;
	}

	public WebElement getClkUpdateBtn() {
		return clkUpdateBtn;
	}

	public void clkShipBillAddressbtn() {
		clkShipBillAddressbtn.click();
	}
	public void UpdateAddress(WebDriverUtility wLib,ExcelUtility eLib,WebDriver driver) throws Throwable {
		billAddressTF.clear();
		billStateTF.clear();
		billCityTF.clear();
		billPinCodeTF.clear();
		clkUpdateBtn.click();
		
	}

}