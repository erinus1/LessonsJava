package main.Selenium_9Module.Task4;

import main.Selenium_9Module.Task2.ChromeTask2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

    public void selectItems() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        Actions actions = new Actions(driver);

        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
        WebElement menuOption1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));

        Thread.sleep(16000);

        Actions builder = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL).click().build().perform();
        actions.click(menuOption).build().perform();
        actions.keyUp(Keys.LEFT_CONTROL).click().build().perform();






    }
}
