package main.Pattern_10Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static WebDriver driver = driverInit();

    public static WebDriver driverInit() {
        if(driver == null) {
            String exePath = "src\\drivers\\chrome\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);
            return new ChromeDriver();
        }
        else {
            return driver;
        }
    }
}
