package com.CaseStudy;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaseStudy4 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of browser you want to run 1.chrome | 2. edge  | 3.firefox): ");
        int num = scanner.nextInt();

        WebDriver driver;

        switch (num) {
            case 1:
                System.setProperty("webdriver.chrome.driver", ".\\Chrome Driver jars\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case 2:
                System.setProperty("webdriver.edge.driver", ".\\Edge Driver jars\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            case 3:
                System.setProperty("webdriver.gecko.driver", ".\\Firefox Driver jars\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser choice.");
                scanner.close();
                return;
        }

        scanner.close();
		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.get("https://demo.opencart.com/");
//		driver.get("http://www.bing.com");
//		driver.get("https://www.freecrm.com/");
//		driver.get("http://www.half.ebay.com");

        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().window().minimize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getTitle().length());

        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://www.hollandandbarrett.com/u/login";

        if (currentURL.equals(expectedURL)) {
            System.out.println("You are on the desired page.");
        } else {
            System.out.println("You are not on the desired page.");
            System.out.println("Current URL: " + currentURL);
        }
        driver.quit();
    }
}
