package main.Pattern_10Module;

import main.Selenium_9Module.Driver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class TestFuncWiilDeleted extends Driver {



    @Before
    public void set() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
}

    @Test
    public void clickOn(){
        Actions actions = new Actions(driver);


        WebElement wom = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
        WebElement dress = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/a"));
        actions.moveToElement(wom);
        actions.moveToElement(dress);
        actions.click().build().perform();

    }
}

