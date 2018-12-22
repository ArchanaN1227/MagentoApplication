package com.abc.MagentoObject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;

public class Homepage 
{
	By myacc=new ByLinkText("My Account");
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public void ClickOnMyAccount() 
	{
		driver.findElement(myacc).click();
	}
	

}
