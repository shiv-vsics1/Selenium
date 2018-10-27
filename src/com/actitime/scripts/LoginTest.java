package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelUtilities;
import com.actitime.pageobjects.EnterTimeTrackPage;
import com.actitime.pageobjects.LoginPage;

public class LoginTest extends BaseLib {
	
	@Test (priority=1)
	public void validLogin()
	{
		String username=ExcelUtilities.readData("Sheet1", 1, 1);
		String password=ExcelUtilities.readData("Sheet1", 1, 2);
		
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		ettp.verifyHomePageLogo();
    	ettp.verifyHomepageTitle();	
	}
	@Test (priority=2)
	public void invalidLogin()    // Test Case 2 for Invalid Login
	{
		String username = ExcelUtilities.readData("Sheet1", 2, 1);
		String password = ExcelUtilities.readData("Sheet1", 2, 2);
		LoginPage lp=new LoginPage(driver);
		lp.login(username, password);
	
		lp.verifyInvalidLoginMsg();
	}
	
}
