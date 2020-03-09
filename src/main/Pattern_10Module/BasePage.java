package main.Pattern_10Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

/*
Сайт: http://automationpractice.com/index.php
Сделать проект с использованием паттернов Page Object, Page Factory (весь сайт не надо, только выбранную предметную область).
1) Перейти на вкладки Women и Dresses.
Проверить, что количество перечисленных цветов на панели выбора и количество представленных цветов совпадают.
Пр., если  2 оранжевых в списке выбора, значит 2 оранжевых должно быть в представленных платьях. Выполнить проверку для всех цветов.
 */

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setWait() {
        if (driver == null) { return; }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}