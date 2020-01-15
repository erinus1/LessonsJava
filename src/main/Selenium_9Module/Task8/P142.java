package main.Selenium_9Module.Task8;
import main.Selenium_9Module.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

/*
Open https://demoqa.com/tooltip-and-double-click/
Check that these  3 elements work as defined :

 */
public class P142 extends Driver {
    public static final Logger logger = LogManager.getLogger();

    @Before
    public void set() {
        driverInit();
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
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClickBtn).perform();
        WebElement list = driver.findElement(By.id("rightclickItem"));
        logger.info("Drop down list is displayed: "+ list.isDisplayed());


        //button 3
        WebElement toolTip = driver.findElement(By.id("tooltipDemo"));
        String expectedTooltip = "We ask for your age only for statistical purposes.";
        action.clickAndHold().moveToElement(toolTip);
        action.moveToElement(toolTip).build().perform();

        WebElement textTip = driver.findElement(By.className("tooltiptext"));
        String actualTooltip = textTip.getText();
        logger.info("Actual Title of ToolTip is: "+ actualTooltip);
        if(actualTooltip.equals(expectedTooltip)) {
            logger.info("Phrase is right!");
        }
        driver.close();
       }
    }


