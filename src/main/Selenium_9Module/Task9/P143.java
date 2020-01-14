package main.Selenium_9Module.Task9;

import main.Selenium_9Module.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

/*
Open https://demoqa.com/tooltip/
 Check that tooltip contains the text statistical purposes

 */
public class P143 extends Driver {
    public static final Logger logger = LogManager.getLogger();

    @Before
    public void set() {
        driver.get("https://demoqa.com/tooltip/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void checkText() {
        WebElement field = driver.findElement(By.id("age"));
        Actions actions = new Actions(driver);
        String expectedText = "We ask for your age only for statistical purposes.";

        actions.moveToElement(field).build().perform();

        WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));
        String toolTipText = toolTipElement.getText();
        logger.info("Text is: " + toolTipText);
        logger.info("Is identical :" + toolTipText.equals(expectedText));
        driver.quit();
        }
    }



