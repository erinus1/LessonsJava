package main.Selenium_9Module.Task2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;

public class ChromeTask2<screenshot> {

    final Logger logger = LogManager.getLogger(ChromeTask2.class);
    ChromeDriver driver = driverInit();

    public ChromeDriver driverInit() {
        String exePath = "C:/Users/Sofiia_Bondarenko/Downloads/chromedriver_win32/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        return new ChromeDriver();
    }

    /*
    @Test
    public void findFistLink() throws InterruptedException {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement searchField = driver.findElement(By.cssSelector("input[name=\"q\"]"));
        searchField.sendKeys("selenium automation testing");
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        WebElement link1 = driver.findElement(By.partialLinkText("www.guru99.com"));
        this.testTakesScreenshot();
    }

    public void testTakesScreenshot() {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(scrFile, new File("C:\\Users\\Sofiia_Bondarenko\\Desktop\\guruLink.png"));
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    public void findSecondLink(){
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement searchField = driver.findElement(By.cssSelector("input[name=\"q\"]"));
        searchField.sendKeys("осциллограф");
        searchField.sendKeys(Keys.ENTER);

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement button10 = driver.findElement(By.cssSelector("[aria-label='Page 10']"));
        button10.click();

        WebElement link2 = driver.findElement(By.partialLinkText("eficenter.ru"));
        js.executeScript("window.scrollTo(0, arguments[0].getBoundingClientRect().y-window.innerHeight/2)", link2);

        testTakesScreenshot();
    }
    */
    @Test
    public void findThirdLink() throws IOException {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement searchField = driver.findElement(By.cssSelector("input[name=\"q\"]"));
        searchField.sendKeys("абырвалг");
        searchField.sendKeys(Keys.ENTER);

        List<WebElement> links = driver.findElements(By.tagName("a"));
        WebElement link3 = driver.findElement(By.partialLinkText("abirval.com"));
        try {
            for (WebElement link : links) {
                if (links.equals(link3)) {
                    logger.info("Link #3 was found");
                }
            }
        } catch (NoSuchElementException err) {
            err.printStackTrace();
            logger.info("This link not found on this page");
        }
    }
}
