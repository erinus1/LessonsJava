package main.Selenium_9Module.Task5;

import main.Selenium_9Module.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
Open https://demoqa.com/sortable/
Check that all the items now are  sorted correctly
Move the 2nd element after the 5th one
 */
public class P139_Sortable extends Driver {
    public static final Logger logger = LogManager.getLogger();

    @Test
    public void sortItem() throws InterruptedException {
        driverInit();
        driver.get("https://demoqa.com/sortable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> menuItems = driver.findElements(By.cssSelector("[id='sortable']"));

        for(WebElement item: menuItems) {
            logger.info("Custom sorting: " + '\n' +item.getText());
        }
        WebElement source = driver.findElement(By.xpath("//li[contains(.,'Item 2')]"));
        WebElement target = driver.findElement(By.xpath("//li[contains(.,'Item 5')]"));

        Actions builder = new Actions(driver);

        int x=target.getLocation().getX();
        int y=target.getLocation().getY();

        //builder.moveToElement(source).clickAndHold();
        //builder.moveToElement(target).clickAndHold(target).perform();

        builder.dragAndDropBy(source, x, y).clickAndHold(source).perform();

        for(WebElement item: menuItems) {
            logger.info("New sorting: " +'\n'+ item.getText());
            }
        //driver.quit();
        }
    }

