package main.Selenium_9Module.Task3;

import main.Selenium_9Module.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
Initialize Edge Driver
Navigate to the interested webpage for e.g. https://en.wikipedia.org/wiki/Main_Page
Create a list of type WebElement to store all the Link elements in to it.
Collect all the links from the webpage. All the links are associated with the Tag ‘a‘.
Now iterate through every link and print the Link Text on the console screen.
 */

    public class P137_Edge extends Driver {
        private WebDriver driver = null;
        final Logger logger = LogManager.getLogger(P137_Edge.class);

        @Before
        public ChromeDriver driverInit() {
            String exePath = "src\\drivers\\edge\\MicrosoftWebDriver.exe";
            System.setProperty("webdriver.edge.driver", exePath);
            return new ChromeDriver();
        }

        @Test
        public void getLinks() {
            driver.get("https://en.wikipedia.org/wiki/Main_Page");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            List<WebElement> links = driver.findElements(By.tagName("a"));
            for (WebElement link : links) {
                logger.info(link.getAttribute("href"));
            }
            driver.quit();
        }
    }
