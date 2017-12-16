package com.scp.selenium.utilities;

public interface AppConstatns {

	String APPLICATION_URL="http://opensource.demo.orangehrmlive.com/";
	
	String LOGIN_PAGE_PASSWORD_NOT_EMPTY="Password cannot be empty";
	String LOGIN_PAGE_USERNAME_NOT_EMPTY="Username cannot be empty";
	String LOGIN_PAGE_INVALID_CREDENTIALS="Invalid credentials";
	
	
	
	enum Browsers{
		FIREFOX,
		CHROME,
		SAFARI,
		IE
	}
	
}
