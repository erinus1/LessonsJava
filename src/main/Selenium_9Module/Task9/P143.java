package main.Selenium_9Module.Task9;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/*
Open https://demoqa.com/tooltip/
 Check that tooltip contains the text statistical purposes

 */
public class P143 {

    final Logger logger = LogManager.getLogger(P143.class);
    ChromeDriver driver = driverInit();

    public ChromeDriver driverInit() {
        String exePath = "src\\drivers\\chrome\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        return new ChromeDriver();
    }

    @Before
    public void set() {
        driver.get("https://demoqa.com/tooltip/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test

    public void checkText() {

        WebElement field = driver.findElementById("age");

        Actions actions = new Actions(driver);
        String expectedText = "We ask for your age only for statistical purposes.";

        actions.moveToElement(field).build().perform();

        WebElement toolTipElement = driver.findElementByCssSelector((".ui-tooltip"));
        String toolTipText = toolTipElement.getText();
        logger.info("Text is: " + toolTipText);
        logger.info("Is identical :" + toolTipText.equals(expectedText));

        }
    }



