package com.scp.selenium.seleniumBatchSeven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SeleniumDemo {
	public static void main(String[] args) {

		/**
		 * Selenium < 3version -- 
		 * 		There is firefox default browser -- not required to executable driver path
		 * 		Chrome/Safari/IE etc -- you need to path
		 * 	    this can be executed on java 7/8
		 * 		<47
		 * 
		 * 
		 * selenium >=3 -- no default browser-- need to set firefox driver explicitly
		 * geckodriver
		 * 	java8
		 * 
		 * Firefox/Chrome/Safari/IE etc -- you need to path
		 * 
		 */
		
		System.setProperty("webdriver.gecko.driver","E:\\MySofts\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		//txtUsername  txtPassword  btnLogin
		WebElement usernameInput = driver.findElement(By.id("txtUsername"));
		WebElement passwordInput = driver.findElement(By.id("txtPassword"));
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		
		usernameInput.clear();
		passwordInput.clear();
		usernameInput.sendKeys("");
		passwordInput.sendKeys("xxxxx");
		loginBtn.click();

		WebElement errorMessage = driver.findElement(By.id("spanMessage"));
		System.out.println("Username cannot be empty#  -- "+errorMessage.getText());
		
		usernameInput.clear();
		passwordInput.clear();
		usernameInput.sendKeys("");
		passwordInput.sendKeys("");
		loginBtn.click();
		errorMessage = driver.findElement(By.id("spanMessage"));
		System.out.println("Username cannot be empty#  -- "+errorMessage.getText());
		
		usernameInput.clear();
		passwordInput.clear();
		usernameInput.sendKeys("qweqweqew");
		passwordInput.sendKeys("");
		loginBtn.click();
		errorMessage = driver.findElement(By.id("spanMessage"));
		System.out.println("Password cannot be empty#  -- "+errorMessage.getText());

		usernameInput.clear();
		passwordInput.clear();
		usernameInput.sendKeys("Admin");
		passwordInput.sendKeys("admin");
		loginBtn.click();
		
		WebElement welcome = driver.findElement(By.id("welcome"));
		System.out.println("Homepage Displayed  -- "+welcome.getText());
		
		Assert.assertEquals(welcome.getText(), "Welcome Admin");
		
		//password null -- Password cannot be empty
		//username & password null - Username cannot be empty
		//incorrect   Invalid credentials
		//Correct - welcome
				
	}

}
