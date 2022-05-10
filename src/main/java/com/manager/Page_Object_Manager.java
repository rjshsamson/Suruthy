package com.manager;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel;
import com.pom.Home_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Page_Object_Manager {

	public WebDriver driver;

	private Home_Page hp;
	private Search_Hotel sh;
	private Select_Hotel sl;
	private Book_Hotel bh;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public Home_Page getHp() {
		if (hp == null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}

	public Search_Hotel getSh() {
		if (sh == null) {
			sh = new Search_Hotel(driver);
		}
		return sh;
	}

	public Select_Hotel getSl() {
		if (sl == null) {
			sl = new Select_Hotel(driver);
		}
		return sl;
	}

	public Book_Hotel getBh() {
		if (bh == null) {
			bh = new Book_Hotel(driver);
		}
		return bh;
	}

}
