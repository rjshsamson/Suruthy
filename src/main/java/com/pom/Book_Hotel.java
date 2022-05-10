package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement FirstName;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement LastName;

	@FindBy(id = "address")
	private WebElement BillingAddress;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	private WebElement CreditCard;

	@FindBy(id = "cc_type")
	private WebElement CardType;

	@FindBy(id = "cc_exp_month")
	private WebElement ExpiryMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement ExpiryYear;

	@FindBy(xpath = "(//input[@type='text'])[14]")
	private WebElement CVV;

	@FindBy(id = "book_now")
	private WebElement BookNow;

	@FindBy(id = "logout")
	private WebElement logout;

	public Book_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditCard() {
		return CreditCard;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBookNow() {
		return BookNow;
	}

	public WebElement getLogout() {
		return logout;
	}

}
