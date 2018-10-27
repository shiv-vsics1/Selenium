package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.GenericLib;
import com.actitime.generic.WaitStatementLib;

public class OpenTasksPage {    // Make this page script according to new APP UI 
	
	WebDriver driver;
    @FindBy(linkText="Projects & Customers")
    private WebElement projNCustLink;
    
    public WebElement getProjNCustLink() {
		return projNCustLink;
	}
	public OpenTasksPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
    public void clickOnProjNCustLink()
    {
    	int secs = Integer.parseInt(GenericLib.getValue("timeout"));
    	WaitStatementLib.eWaitForClickable(driver, secs, projNCustLink);
    	projNCustLink.click();
}
}
