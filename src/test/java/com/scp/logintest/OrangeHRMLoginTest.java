package com.scp.logintest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.scp.orange.login.DashBoardPO;
import com.scp.orange.login.OrangeHRMLoginPO;
import com.scp.selenium.utilities.AppConstatns;
import com.scp.selenium.utilities.DriverInitializer;

/**
 * 
 * Configure testng pluing inside eclipse
 * help> eclipse marketplace--search for testng and install it--restart eclipse
 * now you will get testng options
 * 
 * Search maven dependecy and add dependecy inside pom.xml and repository
 * location inside settings.xml which will present inside local repo--.m2 directory
 * 
 * 
 * Create test class--make sure you are adding test cases inside src/test/java
 * 
 * @author Yogesh
 *
 */

public class OrangeHRMLoginTest {

	
	
  @DataProvider
  public Object[][] testData(){
	  Object[][] setOfUsers = new Object[5][3];
	 
	  setOfUsers[0][0]="";
	  setOfUsers[0][1]="Admin";
	  setOfUsers[0][2]=AppConstatns.LOGIN_PAGE_USERNAME_NOT_EMPTY;
	  
	  setOfUsers[1][0]="";
	  setOfUsers[1][1]="";
	  setOfUsers[1][2]=AppConstatns.LOGIN_PAGE_USERNAME_NOT_EMPTY;
	  
	  setOfUsers[2][0]="admin";
	  setOfUsers[2][1]="12313n";
	  setOfUsers[2][2]=AppConstatns.LOGIN_PAGE_INVALID_CREDENTIALS;
	  
	  setOfUsers[3][0]="admin";
	  setOfUsers[3][1]="";
	  setOfUsers[3][2]=AppConstatns.LOGIN_PAGE_PASSWORD_NOT_EMPTY;
	  
	  setOfUsers[4][0]="admin";
	  setOfUsers[4][1]="Admin";
	  setOfUsers[4][2]="Login Success";
	  
	  return setOfUsers;
  }
	
	
  @Test(enabled=false,dataProvider="testData")
  public void validateLoginPage(String uname,String pwd,String expMsg) {
	OrangeHRMLoginPO loginPage = DriverInitializer.initilizeDriver(AppConstatns.Browsers.FIREFOX);
	DashBoardPO homepage= loginPage.enterCredentials(uname,pwd);
	if(null==homepage)
		Assert.assertEquals(loginPage.getErrormessage(), expMsg);
	else
		Assert.assertNotNull(homepage);
	
  }
    
  
}








