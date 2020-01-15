package main.Selenium_9Module.Task5;
import main.Selenium_9Module.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.concurrent.TimeUnit;

//page 139
public class P139_Sortable extends Driver {
    public static final Logger logger = LogManager.getLogger();

    @Test
    public void sortItem() {
        driverInit();
        driver.get("https://demoqa.com/sortable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> menuItems = driver.findElements(By.cssSelector("[id='sortable']"));

        for(WebElement item: menuItems) {
            logger.info("Custom sorting: " + item.getText());
        }
            Actions builder = new Actions(driver);
            WebElement source = driver.findElement(By.xpath("//li[contains(.,'Item 2')]"));
            WebElement target = driver.findElement(By.xpath("//li[contains(.,'Item 5')]"));
            builder.dragAndDrop(source,target).perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        for(WebElement item: menuItems) {
            logger.info("New sorting: " + item.getText());
            }
        }
    }

