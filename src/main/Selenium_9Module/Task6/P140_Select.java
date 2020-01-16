package main.Selenium_9Module.Task6;
import main.Selenium_9Module.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/*
Open https://demoqa.com/selectable/
Select randomly any 3  elements
Create  the screenshot  with the name (3 elements selected + current  timestamp)
 */

    public class P140_Select extends Driver {
        public static final Logger logger = LogManager.getLogger();

        @Before
        public void set() {
            driver.get("https://demoqa.com/selectable/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());

        public void testTakesScreenshot() {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            try {
                String fileName = "3Items-";
                FileHandler.copy(scrFile, new File("src\\Screen" + fileName + date + ".png"));
            } catch (IOException error) {
                error.printStackTrace();
            }
        }

        public void randomSellect() {
            Random rand = new Random();
            List<WebElement> items = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
            int numberOfElements = 1;
            for (int i = 0; i < numberOfElements; i++) {
                int randomIndex = rand.nextInt(items.size());
                items.get(randomIndex).click();
            }
        }

        @Test
        public void selectItems() {
            driver.get("https://demoqa.com/selectable/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

            Actions actions = new Actions(driver);
            randomSellect();
            actions.keyDown(Keys.LEFT_CONTROL).perform();
            randomSellect();
            randomSellect();
            actions.keyDown(Keys.LEFT_CONTROL).perform();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
            testTakesScreenshot();
            logger.info("Check the screen");
            driver.quit();
        }
    }
