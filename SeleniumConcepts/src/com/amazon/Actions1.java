package com.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(prime);
		Thread.sleep(3000);
		act.contextClick(prime);
		act.build().perform();
		

	}

}
