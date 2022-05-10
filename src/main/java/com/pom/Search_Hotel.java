package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement numberofrooms;

	@FindBy(id="adult_room")
	private WebElement AdultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement ChildrenPerRoom;
	
	@FindBy(id = "Submit")
	private WebElement search;
	
	

	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}

	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return ChildrenPerRoom;
	}
	
	public WebElement getSearch() {
		return search;
	}

	

	
}
