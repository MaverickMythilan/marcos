package com.selectvalue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement account = driver.findElement(By.linkText("Create new account"));
				account.click();
				WebElement firstname = driver.findElement(By.xpath("//input[@aria-label='First name']"));
				firstname.sendKeys("Mythilan");
				WebElement surname = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
				surname.sendKeys("Moorthy");
				WebElement dd = driver.findElement(By.xpath("//select[@id='day']"));
				WebElement mm = driver.findElement(By.xpath("//select[@id='month']"));
				WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
				Select k = new Select(dd);
				k.selectByValue("1");
				Select l = new Select(mm);
				l.selectByValue("2");
				Select m = new Select(year);
				m.selectByValue("1999");
				WebElement sex = driver.findElement(By.xpath("//input[@value='2']"));
			sex.click();
				WebElement email = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
				email.sendKeys("mythilan942@gmail.com");
				WebElement pass = driver.findElement(By.xpath("//input[@aria-label='New password']"));
				pass.sendKeys("123456789");
				

	}

}
