package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Actions_Implementation {
    public WebDriver driver;

    @Test
    public void ContextClick_example() throws InterruptedException, AWTException {
        driver = new ChromeDriver(); //enter the url
        driver.get("https://www.redbubble.com/");
        WebElement ele = driver.findElement(By.linkText("Sell your art")); //right click (context click) on actitime link
        Actions actions = new Actions(driver);
        actions.contextClick(ele).perform();
        Thread.sleep(3000); //press 'w' from the keyboard for opening in a new window
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_W);
        r.keyRelease(KeyEvent.VK_W);
    }

    @Test
    public void DragDropElement() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(300);
        driver.switchTo().frame(0);
        WebElement src= driver.findElement(By.id("draggable"));
        WebElement des= driver.findElement(By.id("droppable"));
        Thread.sleep(300);
        Actions act=new Actions(driver);
        act.dragAndDrop(src,des).perform();
    }



    @Test
    public void hoverElement() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbubble.com/");
        Thread.sleep(300);
        WebElement src= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div[3]/div[1]/div/div/nav/ul/li[4]/a"));
        Thread.sleep(300);
        Actions act = new Actions(driver);
        act.moveToElement(src).perform();
    }

    @Test
    public void Double_click() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbubble.com/");
        Thread.sleep(300);
        WebElement src= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div[3]/div[1]/div/div/nav/ul/li[4]/a"));
        Thread.sleep(300);
        Actions act = new Actions(driver);
        act.doubleClick(src).perform();
    }

}
