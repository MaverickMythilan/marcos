package com.org;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException {
WebDriver dr = new ChromeDriver();
dr.get("https://www.facebook.com/");
WebElement text = dr.findElement(By.linkText("Create new account"));
text.click();
WebElement name = dr.findElement(By.name("firstname"));
name.sendKeys("Mythilan");
WebElement lastname = dr.findElement(By.name("lastname"));
lastname.sendKeys("Moorthy");

WebElement email = dr.findElement(By.name("reg_email__"));
email.sendKeys("6382896785");
WebElement password = dr.findElement(By.name("reg_passwd__"));
password.sendKeys("mythi1801");
TakesScreenshot ts = (TakesScreenshot)dr;
File source = ts.getScreenshotAs(OutputType.FILE);
File dest= new File("C:\\Users\\MU.MYTHILAN\\eclipse-workspace\\SeleniumConcepts\\screenshots\\image.png");
FileHandler.copy(source, dest);



		
	}

}
