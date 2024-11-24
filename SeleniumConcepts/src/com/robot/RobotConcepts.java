package com.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotConcepts {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		WebElement freshicon = driver.findElement(By.xpath("//span[text()='Fresh']"));
		Actions fresh = new Actions(driver);
		fresh.moveToElement(freshicon);
		fresh.build().perform();
		WebElement freshicon1 = driver.findElement(By.xpath("//img[@alt='Amazon Fresh']"));
		act.contextClick();
		act.build().perform();
		String window =driver.getWindowHandle();
		System.out.println(window);
		Robot m = new Robot();
		m.keyPress(KeyEvent.VK_DOWN);
		m.keyRelease(KeyEvent.VK_DOWN);
		m.keyPress(KeyEvent.VK_ENTER);
		m.keyPress(KeyEvent.VK_ENTER);
		Set<String> tab =driver.getWindowHandles();
		for (String h:tab) {
			System.out.println(h);
			if(!window.equalsIgnoreCase(h)) {
				driver.switchTo().window(h);
			}
		}
		

	}

}
