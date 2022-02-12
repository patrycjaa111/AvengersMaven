package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

    public static void main(String[] args) {

        //Setup the "browser driver"
        WebDriverManager.chromedriver().setup();

        //create instance of the selenium WebDriver, this is the line opening an empty browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Go to "https://www.google.com"
        driver.get("https://www.google.com");

        //Verify the title contains "Google"
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Google title Verification PASSED!");
        }else{
            System.out.println("Google title Verification FAILED!!!");
        }

        //Navigate to "https://www.etsy.com"
        driver.navigate().to("https://www.etsy.com");

        //Verify not in google page
        //Verify the title  contains "Etsy"

        expectedTitle = "Etsy";
        actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Etsy title Verification PASSED!");
        }else{
            System.out.println("Etsy title Verification FAILED!!!");
        }

















    }
}
