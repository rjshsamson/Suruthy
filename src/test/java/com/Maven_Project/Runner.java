
package com.Maven_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;

import com.manager.Page_Object_Manager;
import com.pom.Book_Hotel;
import com.pom.Home_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;
import com.properties.File_Reader_Manager;

public class Runner extends BaseClass {
	public static WebDriver driver = browserLaunch("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		urlLaunch(url);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getusername();
		passInput(pom.getHp().getUsername(),username);

		String password=File_Reader_Manager.getInstanceFRM().getInstanceCR().getpassword();
		passInput(pom.getHp().getPassword(),password);

		clickElement(pom.getHp().getLogin());

		SelectByvalue(pom.getSh().getLocation(), "London");

		SelectByvalue(pom.getSh().getHotels(), "Hotel Sunshine");

		SelectByvalue(pom.getSh().getRoomtype(), "Deluxe");

		SelectByvalue(pom.getSh().getNumberofrooms(), "3");

		SelectByvalue(pom.getSh().getAdultsPerRoom(), "2");

		SelectByvalue(pom.getSh().getChildrenPerRoom(), "1");

		clickElement(pom.getSh().getSearch());

		clickElement(pom.getSl().getRadiobutton());

		clickElement(pom.getSl().getContinuebutton());

		String FirstName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getusername();
		passInput(pom.getBh().getFirstName(), FirstName);

		String LastName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastName();
		passInput(pom.getBh().getLastName(), LastName);

		String BillingAddress = File_Reader_Manager.getInstanceFRM().getInstanceCR().getBillingAddress();
		passInput(pom.getBh().getBillingAddress(),BillingAddress);

		String CreditCard = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCreditCard();
		passInput(pom.getBh().getCreditCard(),CreditCard);

		SelectByvalue(pom.getBh().getCardType(), "MAST");

		SelectByvalue(pom.getBh().getExpiryMonth(), "4");

		SelectByvalue(pom.getBh().getExpiryYear(), "2015");

		String CVV = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCVV();
		passInput(pom.getBh().getCVV(), CVV);

		clickElement(pom.getBh().getBookNow());

		clickElement(pom.getBh().getLogout());

		Screenshot("C:\\Users\\Admin\\eclipse-workspace\\Maven_Project\\Screenshot.png");

	}

}
