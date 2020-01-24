package main.Selenium_9Module.Task1;

import main.Selenium_9Module.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
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
public class P101_Wiki extends Driver {
    public static final Logger logger = LogManager.getLogger();
    
    @Before
    public void set() {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void getCoord(WebElement item) {
        int h = item.getSize().getHeight();
        logger.info("Height " + h);
        int w = item.getSize().getWidth();
        logger.info("Width " + w);

        Point point = item.getLocation();
        int xcord = point.getX();
        logger.info("Position of the element of horizontal position: " + xcord + " pixels");
        int ycord = point.getY();
        logger.info("Position of the element of vertical position: " + ycord + " pixels");
    }

    @Test
    public void shootWebElement() throws IOException {
        WebElement area1 = driver.findElement(By.xpath("//div[contains(@id,'mp-itn')]"));
        WebElement area2 = driver.findElement(By.xpath("//*[@id=\"mp-dyk\"]/div[1]/div/a/img"));
        logger.info("News block:");
        getCoord(area1);
        logger.info("Did you know block:");
        getCoord(area2);

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        BufferedImage  fullImg = ImageIO.read(screenshot);
        BufferedImage eleScreenshot= fullImg.getSubimage(area1.getLocation().getX(), area1.getLocation().getY(), area1.getSize().width,area1.getSize().height);
        ImageIO.write(eleScreenshot, "png", screenshot);
        File screenshotLocation = new File("src\\drivers\\" + "NewsBlock" + ".png");
        FileHandler.copy(screenshot, screenshotLocation);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        BufferedImage  fullImg1 = ImageIO.read(screenshot1);
        BufferedImage subimage2= fullImg1.getSubimage(area2.getLocation().getX(), area2.getLocation().getY(), area2.getSize().width,area2.getSize().height);
        ImageIO.write(subimage2, "png", screenshot1);
        File screenshotLocation2 = new File("src\\drivers\\" + "DidYouKnow" + ".png");
        FileHandler.copy(screenshot1, screenshotLocation2);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.quit();
        }
    }






