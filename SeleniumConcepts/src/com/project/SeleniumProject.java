package com.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumProject {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement create = driver.findElement(By.linkText("Create an Account"));
		create.click();
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Mythilan");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Moorthy");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("mythilan942@gmail.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Mythilan@1234");
		WebElement confirm = driver.findElement(By.name("password_confirmation"));
		confirm.sendKeys("Mythilan@1234");
		WebElement account = driver.findElement(By.linkText("Create an Account"));
		account.click();
		WebElement sign = driver.findElement(By.linkText("Sign In"));
		sign.click();
		driver.findElement(By.name("login[username]")).sendKeys("mythilan942@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("Mythilan@1234");
		driver.findElement(By.linkText("Sign In")).click();
		Actions act =new Actions(driver);
		WebElement men = driver.findElement(By.linkText("Men"));
		act.moveToElement(men);
		act.build().perform();
		WebElement top = driver.findElement(By.linkText("Tops"));
		act.moveToElement(top);
		act.build().perform();
		WebElement hoodies = driver.findElement(By.linkText("Hoodies & Sweatshirts"));
		act.moveToElement(hoodies);
		act.build().perform();
	    hoodies.click();
	    WebElement sorter = driver.findElement(By.id("sorter"));
	    Select k = new Select(sorter);
	    k.selectByVisibleText("Price");
	    WebElement material = driver.findElement(By.xpath("//div[text()='Material']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView()",material);
	    material.click();
	    
	   driver.findElement(By.xpath("//a[contains(text(),'Hemp')]")).click();
	    WebElement hero = driver.findElement(By.xpath("//img[@alt='Hero Hoodie']"));
	    act.contextClick(hero);
	    act.build().perform();
	  
	    String currenttab = driver.getWindowHandle();
	   System.out.println(currenttab);
	    Robot rb = new Robot();
	    rb.keyPress(KeyEvent.VK_DOWN);
	   rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	  Set<String> tab = driver.getWindowHandles();
	  for(String t:tab) {
		  System.out.println(t);
		  if(!currenttab.equalsIgnoreCase(t)) {
			  driver.switchTo().window(t);
		  }
	  }
	  WebElement cart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
	  JavascriptExecutor js1 = (JavascriptExecutor)driver;
	  js1.executeScript("arguments[0].scrollIntoView()",cart);
	    driver.findElement(By.xpath("//div[@aria-label='M']")).click();
	    driver.findElement(By.xpath("//div[@aria-label='Green']")).click();
	    WebElement quantity = driver.findElement(By.name("qty"));
	    quantity.clear();
	    quantity.sendKeys("4");
	    cart.click();
		   Set<String> tab1 = driver.getWindowHandles();
			  for(String t1:tab1) {
				  System.out.println(t1);
				  if(!currenttab.equalsIgnoreCase(t1)) {
					  driver.switchTo().window(currenttab);
				  }
			  }
			  WebElement clear = driver.findElement(By.xpath("//span[text()='Clear All']"));
			  clear.click();
			  WebElement cart1 = driver.findElement(By.xpath("//button[@title='Add to Cart']"));
			  JavascriptExecutor js2 = (JavascriptExecutor)driver;
			  js2.executeScript("arguments[0].scrollIntoView()",cart1);
			  WebElement oslohoodie = driver.findElement(By.xpath("//img[@alt='Oslo Trek Hoodie']"));
			  oslohoodie.click();
			  driver.findElement(By.xpath("//div[@aria-label='L']")).click();
			  driver.findElement(By.xpath("//div[@aria-label='Red']")).click();
			  driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
			  cart1.click();
//			  driver.findElement(by.)
			  
			  
			  
			  
	    
	   
	    
	  
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
	}

}
