package Selenium_9Module.Task1;
/*
Initialize Edge Driver
Navigate to the interested webpage for e.g. https://en.wikipedia.org/wiki/Main_Page
Create a list of type WebElement to store all the Link elements in to it.
Collect all the links from the webpage. All the links are associated with the Tag ‘a‘.
Now iterate through every link and print the Link Text on the console screen.
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;

    public class EdgeTask1 {

        private WebDriver driver = null;
        final Logger logger = LogManager.getLogger(EdgeTask1.class);

        @Before
        public void createDriver() {
            String exePath = "C:\\Users\\Sofiia_Bondarenko\\Documents\\EdgeDriver\\MicrosoftWebDriver.exe";
            System.setProperty("webdriver.edge.driver", exePath);
            driver = new EdgeDriver();
        }

        @Test
        public void getLinks() throws InterruptedException {
            driver.get("https://en.wikipedia.org/wiki/Main_Page");
            List<WebElement> links = driver.findElements(By.tagName("a"));
            Thread.sleep(2000);
            for (WebElement link : links) {
                logger.debug(link.getAttribute("There are list of href"));
            }
        }
    }
