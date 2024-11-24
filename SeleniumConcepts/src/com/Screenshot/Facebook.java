package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebook {
	public static void main(String[] args) throws IOException {
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.facebook.com/");
		WebElement textname = browser.findElement(By.linkText("Create new account"));
		textname.click();
		WebElement name = browser.findElement(By.name("firstname"));
		name.sendKeys("Mythilan");
		WebElement lastname = browser.findElement(By.name("lastname"));
		lastname.sendKeys("Moorthy");
		WebElement phone = browser.findElement(By.name("reg_email__"));
		phone.sendKeys("1234567890");
		WebElement password = browser.findElement(By.name("reg_passwd__"));
		password.sendKeys("mythi1801");
		TakesScreenshot my =(TakesScreenshot)browser;
		File source = my.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\MU.MYTHILAN\\eclipse-workspace\\SeleniumConcepts\\src\\screenshot\\image.png");
		FileHandler.copy(source, dest);
		
		
		
	}

}
