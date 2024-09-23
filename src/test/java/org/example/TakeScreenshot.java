package org.example;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {
    public WebDriver driver;

    @Test
    public  void takess() throws IOException, InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://www.redbubble.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("C:\\Users\\kaust\\IdeaProjects\\Automation\\Screenshot\\"+"photo.png");
        FileHandler.copy(srcFile, destFile);
    }
}
