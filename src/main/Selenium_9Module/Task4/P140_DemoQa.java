package main.Selenium_9Module.Task4;

import main.Selenium_9Module.Task2.ChromeTask2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P140_DemoQa {

    final Logger logger = LogManager.getLogger(P140_DemoQa.class);
    ChromeDriver driver = driverInit();

    public ChromeDriver driverInit() {
        String exePath = "C:/Users/Sofiia_Bondarenko/Downloads/chromedriver_win32/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        return new ChromeDriver();
    }

    @Test
    public void findFistLink() throws InterruptedException {
        driver.get("https://demoqa.com/selectable/");
        driver.manage().window().maximize();

    }

    public void select3(){
        WebElement item1 = driver.findElement(By.xpath("//li[contains(.,'Item 1')]"));

    }
}
