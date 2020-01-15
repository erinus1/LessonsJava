package main.Selenium_9Module.Task10;

import main.Selenium_9Module.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.Random;
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
public class P144 extends Driver {
    public static final Logger logger = LogManager.getLogger();

    @Before
    public void set() {
        driverInit();
        driver.get("https://demoqa.com/slider/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void getCoord(WebElement item) {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
        Point position = element.getLocation();
        logger.info("Moved to : " + position);
    }


    public static int generate(int min, int max){
        Random random = new Random();
        return random.ints(min,(max+1)).findFirst().getAsInt();
    }

    @Test
    public void moveSlider() {
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
        logger.info("Instance");
        getCoord(slider);
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider);
        actions.dragAndDropBy(slider, 254, 0).build().perform();
        logger.info("First mooving");
        getCoord(slider);

        String sliderPercent = slider.getAttribute("style");
        assertTrue(sliderPercent.contains("left: 50%"));
        actions.clickAndHold(slider);

        actions.dragAndDropBy(slider, generate(20, 90), 0).build().perform(); //need random coordinates <<<<
        String randonPersent = slider.getAttribute("style");
        logger.info("Random: "+ randonPersent);
        getCoord(slider);
        driver.quit();
    }
}


