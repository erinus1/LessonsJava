package main.Selenium_9Module.Task12;

import main.Selenium_9Module.Driver;
import main.Selenium_9Module.Task7.P141_Resizible;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

/*
Open https://demoqa.com/checkboxradio/
Check that it’s possible to select only one location
Check that it’s possible to select several Hotel ratings

 */
public class P146 extends Driver {
    final Logger logger = LogManager.getLogger(P141_Resizible.class);

    @Before
      public void set() {
        driver.get("https://demoqa.com/checkboxradio/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

    @Test
       public void clickOn() {
        WebElement location = driver.findElement(By.xpath("//div[2]/div/fieldset[1]/label[1]"));
        WebElement box1 = driver.findElement(By.xpath("//*[@id='content']/div[2]/div/fieldset[2]/label[1]"));
        WebElement box2 = driver.findElement(By.xpath(" //*[@id='content']/div[2]/div/fieldset[2]/label[3]"));

        location.click();
        logger.info("Selected a Location:"+ location.getText());
        box1.click();
        logger.info("Selected checkBoxes 'Hotel Ratings' "+ box1.getText());
        box2.click();
        logger.info(" and "+ box2.getText());
        driver.quit();
        }
    }

