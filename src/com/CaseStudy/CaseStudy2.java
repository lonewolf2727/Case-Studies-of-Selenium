package com.CaseStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CaseStudy2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", ".\\Edge Driver jars\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        try {
            driver.get("https://www.hollandandbarrett.com/u/login");
            driver.manage().window().maximize();

            Thread.sleep(5000);

            driver.manage().window().minimize();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
