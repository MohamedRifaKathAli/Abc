package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	private WebDriver driver;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;
	
	
	public WebElement getLogin() {
		return login;
	}

	public POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	
}
