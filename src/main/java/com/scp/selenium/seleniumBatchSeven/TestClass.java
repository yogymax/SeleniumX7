package com.scp.selenium.seleniumBatchSeven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestClass {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\MySofts\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		Thread.sleep(5000);
		ToolsQAPageObject page = PageFactory.initElements(driver, ToolsQAPageObject.class);
		page.enterPersonalDetails("Abc","PQR");
		page.selectGender("Male");
		page.selectExp("7");
		page.selectProfession("Manual Tester","Automation Tester");
		page.selectContinents("South America");
		page.selectCommands("Navigation Commands","Wait Commands");
	}

}
