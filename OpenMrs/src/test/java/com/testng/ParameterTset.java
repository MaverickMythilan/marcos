package com.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class ParameterTset extends Base_Class{
	
	@Test
	@Parameters({"username", "password"})
	public void login(String username, String password) {
		launchBrowser("chrome");
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		implicitWait(30);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

}
}
