package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript_Executor {

    @Test
    public void enterText_indisabletext() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/kaust/OneDrive/Desktop/QA/Test_javascript_executiion.html"); //Typecast the driver object to JavascriptExecutor interface type
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000); //enter "admin" in first textbox using javascript
        js.executeScript("document.getElementById('t1').value='admin'");
        Thread.sleep(2000); //clear the value in second textbox using javascript
        js.executeScript("document.getElementById('t2').value=''"); //enter "manager" in second textbox using javascript
        js.executeScript("document.getElementById('t2').value='manager'"); //change the second text box to button type using Javascript
        js.executeScript("document.getElementById('t2').type='button'");
    }

    @Test
    public void Scrollup_down() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbubble.com/"); //typecasting driver object to JavascriptExecutor interface type
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) { //scroll down on the webpage
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
        }
        for (int i = 1; i < 10; i++) { //scroll up on the webpage
            js.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(3000);
        }
    }

    @Test
    public void Scrollto_element() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        WebElement ele = driver.findElement(By.xpath("/html/body/div/main/div[10]/div/a"));
        int x = ele.getLocation().getX();
        int y = ele.getLocation().getY();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+", "+y+")");
        Thread.sleep(3000);
        ele.click();
    }
}
