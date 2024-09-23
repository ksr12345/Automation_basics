package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class FileUpload_popup {

    WebDriver driver;
    @Test
    public void Autoit() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.get("https://www.ilovepdf.com/split_pdf");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("pickfiles")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("\"C:\\Users\\kaust\\OneDrive\\Desktop\\File_Upload_x64.exe\"");
        Thread.sleep(5000);
        driver.findElement(By.id("processTaskTextBtn")).click();
    }
}
