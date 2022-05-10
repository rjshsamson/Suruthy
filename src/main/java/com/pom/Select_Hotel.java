package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continuebutton;
	
	public Select_Hotel(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}
	

}
