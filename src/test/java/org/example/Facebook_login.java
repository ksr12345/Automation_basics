package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_login {
    public WebDriver driver;
    @Test
    public void login() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Test@123");
        driver.findElement(By.name("login")).click();
    }

    @Test
    public void signin() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(20000);
        driver.findElement(By.name("firstname")).sendKeys("Raj");
        driver.findElement(By.name("lastname")).sendKeys("Singh");
        driver.findElement(By.name("reg_email__")).sendKeys("raj@gamil.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
        driver.findElement(By.name("birthday_day")).sendKeys("27");
        driver.findElement(By.name("birthday_month")).sendKeys("Oct");
        driver.findElement(By.name("birthday_year")).sendKeys("2002");
        driver.findElement(By.xpath("//input[@value=2]")).click();
        driver.findElement(By.name("websubmit")).click();
    }
}
