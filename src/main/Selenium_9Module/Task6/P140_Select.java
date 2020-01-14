package main.Selenium_9Module.Task6;

import main.Selenium_9Module.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/*
Open https://demoqa.com/selectable/
Select randomly any 3  elements
Create  the screenshot  with the name (3 elements selected + current  timestamp)
 */

    public class P140_Select extends Driver {
        public static final Logger logger = LogManager.getLogger();

    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date = simpleDateFormat.format(new Date());

    public void testTakesScreenshot() {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            String fileName = "3Items-";
            FileHandler.copy(scrFile, new File("src\\Screen" + fileName + date + ".png"));
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    @Test
    public void selectItems(){
        driver.get("https://demoqa.com/selectable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
        WebElement menuOption2 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
        WebElement menuOption3 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]"));

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        actions.click(menuOption).perform();
        actions.keyDown(Keys.LEFT_CONTROL).perform();
        actions.click(menuOption2).perform();
        actions.click(menuOption3).perform();
        actions.keyUp(Keys.LEFT_CONTROL).perform();

        logger.info("3 items is found");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        testTakesScreenshot();
        logger.info("Check the screen");
        driver.quit();
    }
}