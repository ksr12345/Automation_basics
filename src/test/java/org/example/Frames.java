package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
    @Test
    public void frames() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/kaust/OneDrive/Desktop/QA/Page2.html");
        driver.switchTo().frame(0);
        driver.findElement(By.id("t1")).sendKeys("a");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("a");
        driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("b");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("b");
        driver.switchTo().frame("n1");
        driver.findElement(By.id("t1")).sendKeys("c");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("c");
        WebElement f = driver.findElement(By.className("c1"));
        driver.switchTo().frame(f);
        driver.findElement(By.id("t1")).sendKeys("d");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("d");
    }
}
