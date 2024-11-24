package com.Xpath;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Instagram {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement account = driver.findElement(By.xpath("//span[text()='Sign up']"));
		account.click();
		//WebDriverWait wait 
		WebElement email = driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		email.sendKeys("mythilan@0942gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		password.sendKeys("12345@mythi");
		WebElement fullname = driver.findElement(By.xpath("//input[@aria-label='Full Name']"));
		fullname.sendKeys("Mythilan");
		WebElement username = driver.findElement(By.xpath("//input[@aria-label='Username']"));
		username.sendKeys("maverick@942");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Dest =new File("C:\\Users\\MU.MYTHILAN\\eclipse-workspace\\SeleniumConcepts\\src\\screenshot\\pics.png");
		FileHandler.copy(Source, Dest);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement thread = driver.findElement(By.xpath("//*[text()='Threads']"));
		js.executeScript("arguments[0].scrollIntoView()",thread);
		
		
	}

}
