package main.Selenium_9Module;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver driver;
    static {
        driver = null;
    }

    public ChromeDriver driverInit() {
        String exePath = "C:/Users/Sofiia_Bondarenko/Downloads/chromedriver_win32/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        return new ChromeDriver();
    }
}
