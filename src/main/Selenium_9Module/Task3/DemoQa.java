package main.Selenium_9Module.Task3;


import main.Selenium_9Module.Task2.ChromeTask2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

//page 139
public class DemoQa {

    private WebDriver driver = null;
    final Logger logger = LogManager.getLogger(DemoQa.class);

    @Before
    public void setDriver() {
        String exePath = "C:\\Users\\Sofiia_Bondarenko\\Documents\\EdgeDriver\\MicrosoftWebDriver.exe";
        System.setProperty("webdriver.edge.driver", exePath);
        driver = new EdgeDriver();
     }

    @Test
    public void sortItem() throws InterruptedException {

        driver.get("https://demoqa.com/sortable/");
        driver.manage().window().maximize();


        List<WebElement> menuItems = driver.findElements(By.cssSelector("[id='sortable']"));

        for (WebElement item: menuItems) {
            logger.info("Custom sorting: " + item.getText());

        }
            Actions builder = new Actions(driver);
            WebElement source = driver.findElement(By.xpath("//li[contains(.,'Item 2')]"));
            WebElement target = driver.findElement(By.xpath("//li[contains(.,'Item 5')]"));
            builder.dragAndDrop(source,target).perform();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for (WebElement item: menuItems){
            logger.info("New sorting: " + item.getText());
            }
        }
    }

