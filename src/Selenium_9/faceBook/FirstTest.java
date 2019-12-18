package Selenium_9.faceBook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    final static Logger logger = LogManager.getLogger(FirstTest.class);

    @Test
    public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Sofiia_Bondarenko/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://hotline.ua/login/");

        WebElement emailElement = driver.findElement(By.cssSelector("d[class='form-item'] input, [name=login]"));
        emailElement.sendKeys("qasof991@gmail.com");

        WebElement passElement = driver.findElement(By.cssSelector("d[class='form-item'] input, [name='password']"));
        passElement.sendKeys("Qwerty!!1");

        WebElement button = driver.findElement(By.cssSelector("div:nth-child(3) > input, [data-id='verification']"));
        button.click();

        Thread.sleep(10000);

        boolean textFound = false;
        try {
            driver.findElement(By.cssSelector("div.item-login > span.name.ellipsis")).click();
            textFound = true;
            logger.info("You are login");

        } catch (Exception elementNotFound) {
           logger.info("Element was not found");
        }
        driver.quit();
    }
}

