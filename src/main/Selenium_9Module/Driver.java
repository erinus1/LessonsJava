package main.Selenium_9Module;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

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
