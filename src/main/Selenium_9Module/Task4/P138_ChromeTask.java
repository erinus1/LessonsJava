package main.Selenium_9Module.Task4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/*
/1. For  Chrome  and Edge – open the browser
2. Goto google.com
3. Search for something that:
	3.1 is located on the first page of search results
	3.2  is located  further then 10th page
	3.3   is not in the search results
4. Save  screenshot if result is found
5. Provide user with the corresponding error message if result is not found
6. Print to Console  Page number if result is found

Example:
1. We  enter “selenium automation testing”  and find that “seleniumhq.org”  is on the 1st page
2. We  enter “осциллограф”  and find that “vit.ua”  is on  some  page
3. We enter “абракадабра”  and find that “kpi.ua” is not in the search results

 */

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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


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
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        //third not found
        WebElement search10 = driver.findElementByXPath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div/div[2]/input");
        search10.clear();
        search10.sendKeys("абракадабра");
        search10.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        try {
            driver.findElement((By.partialLinkText("en.wikipedia.org")));
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofMillis(300))
                    .pollingEvery(Duration.ofMillis(600))
                    .ignoring(NoSuchElementException.class);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            logger.info("Please see a screenshot of page with No Result");
            testTakesScreenshot("3rdLink");

        } finally {
            driver.quit();
        }
    }
}




