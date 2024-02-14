package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//*[@class='fa fa-lock']")
	private WebElement signin;
	
	@FindBy(xpath = "(//*[@name='email'])[1]")
	private WebElement email;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "(//*[@class='btn btn-default'])[1]")
	private WebElement login;
	
	
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}

	
	
	
	

}
