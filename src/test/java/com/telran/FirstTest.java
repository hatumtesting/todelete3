package com.telran;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver wd = new ChromeDriver();
    @Test
    public void opengoogle(){
        wd.get("https://google.com");
    }
}
