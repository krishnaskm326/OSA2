package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement userNameTF;
	@FindBy(name = "password")
	private WebElement passwordTF;
	@FindBy(xpath = "//button[.='Login']")
	private WebElement clkLoginBtn;
	public WebElement getUserNameTF() {
		return userNameTF;
	}
	public WebElement getPasswordTF() {
		return passwordTF;
	}
	public WebElement getClkLoginBtn() {
		return clkLoginBtn;
	}
	public AdminLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void adminLogin(String userName,String password) {
		userNameTF.sendKeys(userName);
		passwordTF.sendKeys(password);
		clkLoginBtn.click();
	}
		
}
