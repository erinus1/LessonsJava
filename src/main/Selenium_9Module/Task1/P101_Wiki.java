package main.Selenium_9Module.Task1;


import main.Selenium_9Module.Task7.P141_Resizible;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.awt.*;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;


/*
Navigate to https://en.wikipedia.org/wiki/Main_Page
Take Screenshot of the first Image  in the “Did you know...” container
Take Screenshot of the “In the news” container

 */
public class P101_Wiki {

    final Logger logger = LogManager.getLogger(P101_Wiki.class);
    ChromeDriver driver = driverInit();

    public ChromeDriver driverInit() {
        String exePath = "C:/Users/Sofiia_Bondarenko/Downloads/chromedriver_win32/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        return new ChromeDriver();
    }

    @Before
    public void set() {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void getCoord(WebElement item) {
        WebElement element = driver.findElement(By.id("mp-itn"));
        int h = element.getSize().getHeight();
        logger.info("Height " + h);

        int w = element.getSize().getWidth();
        logger.info("Width " + w);

        Point point = element.getLocation();
        int xcord = point.getX();
        logger.info("Position of the element of horizontal position: " + xcord + " pixels");
        int ycord = point.getY();
        logger.info("Position of the element of vertical position: " + ycord + " pixels");

    }

    @Test

    public void shootWebElement() throws IOException {

        WebElement area1 = driver.findElement(By.id("mp-itn"));
        getCoord(area1);

        // Get entire page screenshot
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        BufferedImage  fullImg = ImageIO.read(screenshot);

        BufferedImage eleScreenshot= fullImg.getSubimage(area1.getLocation().getX(), area1.getLocation().getY(), area1.getSize().width,area1.getSize().height);
        ImageIO.write(eleScreenshot, "png", screenshot);

        File screenshotLocation = new File("src\\Screen" + "NewsBlock01" + ".png");
        FileHandler.copy(screenshot, screenshotLocation);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();

        }

    }






