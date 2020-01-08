package main.Selenium_9Module.Task8;

import main.Selenium_9Module.Task4.P138_ChromeTask;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/*
Open https://demoqa.com/tooltip-and-double-click/
Check that these  3 elements work as defined :

 */
public class P142 {

    final Logger logger = LogManager.getLogger(P142.class);
    ChromeDriver driver = driverInit();

    public ChromeDriver driverInit() {
        String exePath = "src\\drivers\\chrome\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        return new ChromeDriver();
    }

    @Before
    public void set() {
        driver.get("https://demoqa.com/tooltip-and-double-click/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    Actions action = new Actions(driver);

    @Test


    public void checkButtons() {

        //button1
        WebElement doubleCl = driver.findElement(By.id("doubleClickBtn"));

        action.doubleClick(doubleCl).perform();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        logger.info("Alert text is: " + alertText);
        simpleAlert.accept();

        //button 2
        WebElement rightClickBtn = driver.findElementById("rightClickBtn");
        action.contextClick(rightClickBtn).perform();
        WebElement list = driver.findElementById("rightclickItem");
        logger.info("Drop down list is displayed: "+ list.isDisplayed());


        //button 3
        WebElement toolTip = driver.findElementById("tooltipDemo");
        String expectedTooltip = "We ask for your age only for statistical purposes.";
        action.clickAndHold().moveToElement(toolTip);
        action.moveToElement(toolTip).build().perform();

        WebElement textTip = driver.findElementByClassName("tooltiptext");
        String actualTooltip = textTip.getText();
        logger.info("Actual Title of ToolTip is: "+ actualTooltip);
        if(actualTooltip.equals(expectedTooltip)) {
            logger.info("Phrase is right!");
        }

        driver.close();
         }
    }


