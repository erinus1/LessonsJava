package main.Pattern_10Module;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.HashMap;

public class TestPage {
    static WebDriver driver;

    @BeforeClass
    public static void init() {
        String exePath = "src\\drivers\\chrome\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
    }

    public TestPage() {
        PageFactory.initElements(driver, this);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @Test
    public void checkDressPage() {
        DressProductLandingPage dressPage = PageFactory.initElements(driver, DressProductLandingPage.class);
        Assert.assertEquals(dressPage.openPLP(), "http://automationpractice.com/index.php?id_category=8&controller=category");
        HashMap<String, Integer> expectedColors = dressPage.getColorsFromLayerNavMenu();
        HashMap<String, Integer> actualColors = dressPage.getPageColors();
        Assert.assertTrue(expectedColors.equals(actualColors));
    }

    @Test
    public void checkWomanPage() {
        WomanProductLandingPage womanPage = PageFactory.initElements(driver, WomanProductLandingPage.class);
        Assert.assertEquals(womanPage.openPLP(), "http://automationpractice.com/index.php?id_category=3&controller=category");
        HashMap<String, Integer> expectedColors = womanPage.getColorsFromLayerNavMenu();
        HashMap<String, Integer> actualColors = womanPage.getPageColors();
        Assert.assertTrue(expectedColors.equals(actualColors));
    }

    @AfterClass
    public static void close() {
        driver.close();
    }
}