package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class ChildBrowser_popup {

    WebDriver driver;

    @Test
    public void childBrowser() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.get("https://www.exness.com/");
        driver.manage().window().maximize();
        String parentwindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div[3]/div[2]/a[2]")).click();
        Thread.sleep(5000);
        for  (String windowhand : driver.getWindowHandles()) {
            if (!windowhand.equals(parentwindowHandle)) {
                driver.switchTo().window(windowhand);
            }
        }
        driver.findElement(By.name("login")).sendKeys("mohdanwarshaikh9@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("Anwar@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div[2]/form/button")).click();
        Thread.sleep(2000);

        String childtitle = driver.getTitle();
        System.out.println("Title of the child tab is :" + childtitle);


    }
}
