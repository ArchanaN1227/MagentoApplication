package com.abc.MagentoObject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;

public class Logout {
	WebDriver driver;
	By logout=new ByLinkText("Log Out");
	public Logout(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void ClickOnLogout()
	{
		driver.findElement(logout).click();
	}

}
