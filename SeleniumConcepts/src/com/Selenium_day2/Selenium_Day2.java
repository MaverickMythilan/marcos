package com.Selenium_day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day2 {
	public static void main(String[] args) {
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.meesho.com");
		String currenturl = browser.getCurrentUrl();
		System.out.println("Currenturl = "+ currenturl);
		String title =browser.getTitle();
		System.out.println("Title ="+ title);
		String pagesource = browser.getPageSource();
		System.out.println("pagesource="+pagesource);
		//browser.close();
		browser.quit();
		
		
	}

}
