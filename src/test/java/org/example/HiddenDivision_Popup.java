package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HiddenDivision_Popup {

    WebDriver driver = new ChromeDriver();

    @Test
    public void HiddenDivision() throws InterruptedException{
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/label/p[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[5]")).click();
    }
}
