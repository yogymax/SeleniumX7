package com.scp.orange.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.scp.selenium.utilities.DriverInitializer;

public class OrangeHRMLoginPO {

	@FindBy(id="txtUsername")
	WebElement username;
	// WebElement username = driver.findelement(By.id("txtUsername"));
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement signbtn;
	
	@FindBy(id="spanMessage")
	WebElement errorMsg;
	
	public DashBoardPO enterCredentials(String uname,String pwd){
		this.username.clear();
		this.username.sendKeys(uname);
		
		this.password.clear();
		this.password.sendKeys(pwd);
		
		signbtn.click();
		
		if(checkForErrorMessage())
			return null;
		
		return PageFactory.initElements(DriverInitializer.driver,DashBoardPO.class);
	}


	public boolean  checkForErrorMessage() {
		try{
			return errorMsg.isEnabled();
		}catch(Exception e){
		return false;
		}
	}
	
	public String getErrormessage(){
		return errorMsg.getText();
	}
}
