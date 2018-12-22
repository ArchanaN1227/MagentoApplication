package com.abc.MagentoObject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	By email=new ById("email");
	By pwd=new ById("pass");
	By login=new ById("send2");
	
	public Login(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void TypeEmail(String data)
	{
		driver.findElement(email).sendKeys(data);
	}
	public void TypePassword(String data) {
		driver.findElement(pwd).sendKeys(data);
	}
	public void Login() {
		driver.findElement(login).click();
	}
	
}