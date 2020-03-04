package main.Pattern_10Module;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/*
Сайт: http://automationpractice.com/index.php
Сделать проект с использованием паттернов Page Object, Page Factory (весь сайт не надо, только выбранную предметную область).
1) Перейти на вкладки Women и Dresses.
Проверить, что количество перечисленных цветов на панели выбора и количество представленных цветов совпадают.
Пр., если  2 оранжевых в списке выбора, значит 2 оранжевых должно быть в представленных платьях. Выполнить проверку для всех цветов.
 */

public class BasePage {
    public static WebDriver driver = driverInit();

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

    @After
    public void close() {
        driver.quit();
    }
}
