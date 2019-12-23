package main.Selenium_9Module.Task5;

import main.Selenium_9Module.Task4.P140_DemoQa;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

//page 141
public class Task5 {

    final Logger logger = LogManager.getLogger(Task5.class);
    ChromeDriver driver = driverInit();

    public ChromeDriver driverInit() {
        String exePath = "C:/Users/Sofiia_Bondarenko/Downloads/chromedriver_win32/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        return new ChromeDriver();
    }

    @Test
    public void resize() throws InterruptedException {
        driver.get("https://demoqa.com/resizable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement cube = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        Actions builder = new Actions(driver);
       //Dimension dime = cube.getSize();

        //builder.dragAndDropBy(cube, 100, 200).perform();


        Thread.sleep(6000);

        builder.clickAndHold(cube).moveByOffset(80,80).release().build().perform();




    }
}


