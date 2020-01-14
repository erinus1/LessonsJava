package main.Selenium_9Module.Task7;
import main.Selenium_9Module.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

/*
Open https://demoqa.com/resizable/
Get the current size of the rectangle  and print it to console
Resize the rectangle  (make it  bigger)
Get the current size of the rectangle  and print it to console
Resize the rectangle  (make it  smaller)
Get the current size of the rectangle  and print it to console
 */

public class P141_Resizible extends Driver {
    public static final Logger logger = LogManager.getLogger();

    @Before
    public void set() {
        super.driverInit(driver);
        driver.get("https://demoqa.com/resizable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void getCoord(WebElement cub) {
        WebElement cube = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        Point point = cube.getLocation();
        int xcord = point.getX();
        logger.info("Position of the element of horizontal position: " + xcord + " pixels");
        int ycord = point.getY();
        logger.info("Position of the element of vertical position: " + ycord + " pixels");
    }

    @Test
    public void resize() {
        WebElement cube = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(cube, 400, 200).build().perform();
        logger.info("Bigger cube: ");
        getCoord(cube);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        builder.dragAndDropBy(cube, -50, -50).build().perform();
        logger.info("Smaller cube: ");
        getCoord(cube);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.quit();
    }
}
