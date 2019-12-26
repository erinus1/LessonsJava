package main.Selenium_9Module.Task5;
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
public class P139_Sortable {

    private WebDriver driver = null;
    final Logger logger = LogManager.getLogger(P139_Sortable.class);

    @Before
    public void setDriver() {
        String exePath = "C:\\Users\\Sofiia_Bondarenko\\Documents\\EdgeDriver\\MicrosoftWebDriver.exe";
        System.setProperty("webdriver.edge.driver", exePath);
        driver = new EdgeDriver();
     }

    @Test
    public void sortItem() {

        driver.get("https://demoqa.com/sortable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> menuItems = driver.findElements(By.cssSelector("[id='sortable']"));

        for (WebElement item: menuItems) {
            logger.info("Custom sorting: " + item.getText());
        }
            Actions builder = new Actions(driver);
            WebElement source = driver.findElement(By.xpath("//li[contains(.,'Item 2')]"));
            WebElement target = driver.findElement(By.xpath("//li[contains(.,'Item 5')]"));
            builder.dragAndDrop(source,target).perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        for (WebElement item: menuItems){
            logger.info("New sorting: " + item.getText());
            }
        }
    }

