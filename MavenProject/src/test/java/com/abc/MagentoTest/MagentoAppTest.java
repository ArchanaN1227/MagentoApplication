package com.abc.MagentoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.abc.MagentoObject.Homepage;
import com.abc.MagentoObject.Login;
import com.abc.MagentoObject.Logout;

public class MagentoAppTest {
	@Test
	public void Credentials() {
		WebDriver driver = new ChromeDriver();
		String url="http://www.magento.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		
		Homepage h = new Homepage(driver);
		h.ClickOnMyAccount();
		
		Login l1 = new Login(driver);
		l1.TypeEmail("sucheendra.abc@gmail.com");
		l1.TypePassword("Welcome123");
		l1.Login();
		
		Logout l2 = new Logout(driver);
		l2.ClickOnLogout();
		
		driver.quit();
	}

}
