package main.Selenium_9Module.Task2;

import main.Selenium_9Module.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


/*
Launch new Browser
Open URL http://facebook.com
Type Login
Type Password
Click on Вход button
Check that you have logged in
Close the Browser

 */

//CL block this site
public class P71_FaceBook extends Driver {
    public static final Logger logger = LogManager.getLogger();

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Sofiia_Bondarenko/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://hotline.ua/login/");

        WebElement emailElement = driver.findElement(By.cssSelector("d[class='form-item'] input, [name=login]"));
        emailElement.sendKeys("qasof991@gmail.com");

        WebElement passElement = driver.findElement(By.cssSelector("d[class='form-item'] input, [name='password']"));
        passElement.sendKeys("Qwerty!!1");

        WebElement button = driver.findElement(By.cssSelector("div:nth-child(3) > input, [data-id='verification']"));
        button.click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

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