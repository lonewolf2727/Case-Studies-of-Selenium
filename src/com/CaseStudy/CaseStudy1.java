package com.CaseStudy;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1{

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\Chrome Driver jars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/u/login");
		
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getTitle().length());
//		
//		String currentURL = driver.getCurrentUrl();
//		String expectedURL = "https://www.hollandandbarrett.com/u/login";  
//
//		if (currentURL.equals(expectedURL)) {
//		    System.out.println("You are on the desired page.");
//		} else {
//		    System.out.println("You are not on the desired page.");
//		    System.out.println("Current URL: " + currentURL);
//		}
//		
		//System.out.println(driver.getPageSource());
		
		driver.quit();
	}
	

}
