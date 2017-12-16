package com.scp.selenium.seleniumBatchSeven;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ToolsQAPageObject {
	
	@FindBy(name="firstname")
	WebElement firstNameInput;
	//WebElement firstNameInput =driver.findElement(By.name("firstName"))
	
	@FindBy(name="lastname")
	WebElement lastNameInput;
	
	@FindBy(name="sex")
	List<WebElement> gender;
	//List<WebElement> firstNameInput =driver.findElements(By.name("firstName"))
	
	@FindBy(xpath="//*[starts-with(@id,'exp')]")
	List<WebElement> yearOfExp;
	
	@FindBy(id="datepicker")
	WebElement date;
	
	@FindBy(name="profession")
	List<WebElement> profession;
	
	@FindBy(id="photo")
	WebElement profilePic;
	
	@FindBy(id="tool")
	List<WebElement> automationTools;
	
	@FindBy(id="continents")
	WebElement countries;

	@FindBy(name="selenium_commands")
	WebElement automationCmds;
	
	public void enterPersonalDetails(String fname,String lname){
		firstNameInput.clear();
		firstNameInput.sendKeys(fname);
		
		lastNameInput.clear();
		lastNameInput.sendKeys(lname);
	}

	public void selectGender(String expected){
		for(WebElement item :gender){
			if(item.getAttribute("value").equals(expected)){
				item.click();
				break;
			}
		}
	}
	
	public void selectExp(String expected){
		for(WebElement item :yearOfExp){
			if(item.getAttribute("value").equals(expected)){
				item.click();
				break;
			}
		}
	}
	
	
	public void selectProfession(String ...expectedVal){
		for(String prof:expectedVal){
			for(WebElement item :profession){
				if(item.getAttribute("value").equals(prof)){
					item.click();
				}
			}
		}
	}
	

	public void selectAutomationTool(String ...expectedVal){
		for(String tool:expectedVal){
			for(WebElement item :automationTools){
				if(item.getAttribute("value").equals(tool)){
					item.click();
				}
			}
		}
	}
	
	
	public void selectContinents(String country){
		Select select = new Select(countries);
		select.selectByVisibleText(country);
	}


	public void selectCommands(String ...cmds){
		Select select = new Select(automationCmds);
		
		for(String item :cmds)
			select.selectByVisibleText(item);
	}

	
	
	
	
	
	
	
	

}
