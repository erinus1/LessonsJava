package main.Selenium_9Module.Task4F;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class P138_ChromeTask {

    final Logger logger = LogManager.getLogger(P138_ChromeTask.class);
    ChromeDriver driver = driverInit();

    public ChromeDriver driverInit() {
        String exePath = "C:/Users/Sofiia_Bondarenko/Downloads/chromedriver_win32/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        return new ChromeDriver();
    }

    public void testTakesScreenshot(String fileName) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(scrFile, new File("C:\\Users\\Sofiia_Bondarenko\\Desktop\\" + fileName + ".png"));
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    @Test
    public void findLinks() {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //first screenshot 1 page
        WebElement searchField = driver.findElement(By.cssSelector("input[name=\"q\"]"));
        searchField.sendKeys("selenium automation testing");
        searchField.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement link1 = driver.findElement(By.partialLinkText("www.guru99.com"));
        String strng = link1.getAttribute("href");
        logger.info(strng + " is found");
        Assert.assertEquals("https://www.guru99.com", strng.replaceAll("\\.com.*", "\\.com"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logger.info("Please see a screenshot of 1st page");
        testTakesScreenshot("1st-page");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        //second link 10 page
        WebElement input = driver.findElementByXPath("//*[@id='tsf']/div[2]/div[1]/div[2]/div/div[2]/input");
        input.clear();
        input.sendKeys("осциллограф");
        input.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement button10 = driver.findElement(By.cssSelector("[aria-label='Page 10']"));
        logger.info("Page 10 is found with not stable result");
        button10.click();
        logger.info("Please see a screenshot of 10th page");
        testTakesScreenshot("page10");

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        //third not found
        WebElement search10 = driver.findElementByXPath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div/div[2]/input");
        search10.clear();
        search10.sendKeys("абырвалг");
        search10.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        try {
        WebElement link3 = driver.findElement(By.partialLinkText("ru.wikipedia.org/wiki"));

            for (WebElement link : links) {
                if (links.equals(link3)) {
                    logger.info("Link 3rd was found");
                }
            }
        } catch (NoSuchElementException err) {
            err.printStackTrace();
            logger.info("This link not found on this page");
        }
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        logger.info("Please see a screenshot of page");
        testTakesScreenshot("3rdLink");
        driver.quit();
    }
}




