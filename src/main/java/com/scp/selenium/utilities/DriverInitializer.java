/**
 * 
 */
package com.scp.selenium.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.scp.orange.login.OrangeHRMLoginPO;

/**
 * @author Yogesh
 *
 */
public class DriverInitializer {

	public static WebDriver driver = null;

	/**
	 * 
	 * @return
	 */
	public static OrangeHRMLoginPO initilizeDriver(AppConstatns.Browsers browserName) {

		switch (browserName) {
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver","E:\\MySofts\\geckodriver-v0.19.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case CHROME:
			System.setProperty("webdriver.chrome.driver","E:\\MySofts\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case IE:
			driver = new InternetExplorerDriver();
			break;
		case SAFARI:
			driver = new SafariDriver();
			break;
		default:
			Assert.fail("Functionlity is not present for given browser type..!");

		}
		driver.get(AppConstatns.APPLICATION_URL);
		return PageFactory.initElements(driver,OrangeHRMLoginPO.class);
	}

}
