package main.Pattern_10Module;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver = driverInit();
    public WebDriverWait wait;
    public static  WebDriver driverInit() {
        if(driver == null) {
            String exePath = "src\\drivers\\chrome\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);

            return new ChromeDriver();
        }
        else {
            return driver;
        }
    }

    @Before
    public void setWait(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /*
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

     */

    @After
    public void close() {
        driver.quit();
    }
}
