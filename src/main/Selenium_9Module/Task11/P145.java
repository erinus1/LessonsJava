package main.Selenium_9Module.Task11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/*
1. Open https://demoqa.com/datepicker/
2. Select the random day  in August 2019
3 check that this date was selected

 */
public class P145 {

    final Logger logger = LogManager.getLogger(P145.class);
    ChromeDriver driver = driverInit();

    public ChromeDriver driverInit() {
        String exePath = "src\\drivers\\chrome\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        return new ChromeDriver();
    }

    @Before
    public void set() {
        driver.get("https://demoqa.com/datepicker/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean isThisDateValid (String dateToValidate, String dateFormat){

        if (dateToValidate == null) {
            return false;
        }

        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        format.setLenient(false);

        try {
            Date parseDate = format.parse(dateToValidate);
            logger.info(parseDate);

        } catch (ParseException e) {

            e.printStackTrace();
            return false;
        }

        return true;
    }

    @Test

    public void selectDate() {

        WebElement date = driver.findElement(By.id("datepicker"));
        date.click();

        WebElement clickDate = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a"));
        clickDate.click();
        logger.info("Selected date is " + clickDate.getText());

        assertTrue(isThisDateValid("01/14/2020", "MM/dd/yyyy"));

        driver.quit();
        }

}









