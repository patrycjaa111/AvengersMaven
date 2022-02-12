package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {


    public static void main(String[] args) {



        //Setup the "browser driver"
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Go to "https://www.selenium.dev"
        driver.get("https://www.selenium.dev");

        //Verify the title contains "Selenium"

        String expectedTitle = "Selenium";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification PASSED");
        }else{
            System.out.println("Title Verification FAILED");
        }









    }




}
