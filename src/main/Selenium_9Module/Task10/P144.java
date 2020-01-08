package main.Selenium_9Module.Task10;


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
import static org.junit.Assert.assertTrue;

/*
Open  https://demoqa.com/slider/
Get sliders’ current position and print to console
Move the slider to 50 %
Get sliders’ current position and print to console
Move slider randomly
Get sliders’ current position and print to console

 */
public class P144 {

    final Logger logger = LogManager.getLogger(P144.class);
    ChromeDriver driver = driverInit();

    public ChromeDriver driverInit() {
        String exePath = "src\\drivers\\chrome\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        return new ChromeDriver();
    }

    @Before

    public void set() {
        driver.get("https://demoqa.com/slider/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void getCoord(WebElement item) {
        WebElement element = driver.findElementByXPath("//*[@id=\"slider\"]/span");
        Point position = element.getLocation();
        logger.info("Moved to : " + position);

    }

    @Test

    public void moveSlider(){

        WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
        getCoord(slider);

        Actions actions = new Actions(driver);
        actions.clickAndHold(slider);
        actions.dragAndDropBy(slider, 254, 0).build().perform();
        getCoord(slider);
        String sliderPercent = slider.getAttribute("style");
        assertTrue(sliderPercent.contains("left: 50%"));

        actions.clickAndHold(slider);
        actions.dragAndDropBy(slider, 170, 0).build().perform();
        getCoord(slider);
        String randonPersent = slider.getAttribute("style");
        assertTrue(randonPersent.contains("left: 83%"));

        driver.quit();

    }

}

