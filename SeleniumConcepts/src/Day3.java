import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.name("username"));
	    userName.sendKeys("mythilan");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("123456789");
//	    WebElement login = driver.findElement(By.name("login"));
//	    login.click();
		
	}

}
