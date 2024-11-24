package waitconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Mythilan");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123myth");
		
//		WebDriverWait l = new WebDriverWait(driver,Duration.ofSeconds(10));
//		l.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("Create new account"))));
	
//		System.out.println("Welcome");
//		Thread.sleep(1000);
//		System.out.println("to");
//		Thread.sleep(1000);
//        System.out.println("Greens");
//		Thread.sleep(1000);
//        System.out.println("Technology");
//	    Thread.sleep(1000);

	}

}
