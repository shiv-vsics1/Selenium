package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePage {
	
	@FindBy(css="img[src*='default-logo.png']")
	private WebElement logo;
	@FindBy(xpath="//div[text()= 'Tasks']")
	private WebElement Tasks;
	@FindBy(id="logoutLink")
	private WebElement logoutLink; 
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    public void verifyHomePageLogo()
    {
	Assert.assertTrue(logo.isDisplayed());
	Reporter.log("Home Page logo is displayed", true);
    }    
    public void clickOnTasks()
    {
    	Tasks.click();
    }
    public void clickOnLogoutLink()
    {
    	logoutLink.click();
    }
    
   }
