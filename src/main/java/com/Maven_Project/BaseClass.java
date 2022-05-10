package com.Maven_Project;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public static Actions ac;
	public static Select s;

	// browser launch

	public static WebDriver browserLaunch(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
		

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (browsername.equalsIgnoreCase("Firefox")) {

			// System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
			// "\\Driver\\chromedriver.exe");
			// driver = new FirefoxDriver();
			// driver.manage().window().maximize();

		}
		return driver;
	}

	// url launch

	public static void urlLaunch(String url) {
		driver.get(url);

	}

	// close
	public static void closeBrowser() {
		driver.close();

	}

	// quit
	public static void quitBrowser() {
		driver.quit();

	}

	// sendkeys
	public static void passInput(WebElement element, String input) {
		element.sendKeys(input);

	}

	// click
	public static void clickElement(WebElement element) {
		element.click();

	}

	// navigate to
	public static void navigateTo(String input) {
		driver.navigate().to(input);

	}

	// navigate back
	public static void navigateBack() {
		driver.navigate().back();

	}

	// navigate forward
	public static void navigateForward() {
		driver.navigate().forward();

	}

	// refresh
	public static void refreshPage() {
		driver.navigate().refresh();

	}

	// alert accept
	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	// alert dismiss
	public static void dismissAlert() {
		driver.switchTo().alert().dismiss();

	}

//alert sendkeys
	public static void sendkeyAlert(String input) {
		driver.switchTo().alert().sendKeys(input);

	}

	// Action -click
	public static void clickelement(WebElement element) {
		ac = new Actions(driver);
		ac.click(element).build().perform();
	}

	// Action-double click
	public static void doubleclickelement(WebElement element) {
		ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
	}

	// Actions-Context click
	public static void ContextClick(WebElement element) {
		ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	// Actions-move to element
	public static void MoveToElement(WebElement element) {
		ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	// Actions Drag and drop
	public static void dragAndDrop(WebElement e1, WebElement e2) {
		ac = new Actions(driver);
		ac.dragAndDrop(e1, e2).build().perform();
	}

	// Select - select by value
	public static void SelectByvalue(WebElement element, String input) {
		s = new Select(element);
		s.selectByValue(input);

	}

	// Select - select by index
	public static void SelectByindex(WebElement element, int input) {
		s = new Select(element);
		s.selectByIndex(input);
	}

	// Select - select by visible Text
	public static void SelectByVisbileText(WebElement element, String input) {
		s = new Select(element);
		s.selectByVisibleText(input);
	}

	// screenshot
	public static void Screenshot(String input) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven_Project\\Screenshot.png");
		FileUtils.copyFile(source, destination);

	}

}
