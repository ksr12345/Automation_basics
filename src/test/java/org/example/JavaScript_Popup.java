package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript_Popup {

    WebDriver driver;

    @Test
    public void simple_alert_popup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.accept();
    }

    @Test
    public void Prompt_popup() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Abc");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }
}
