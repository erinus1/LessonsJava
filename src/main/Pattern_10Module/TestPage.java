package main.Pattern_10Module;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.HashMap;

public class TestPage extends BasePage {

    public TestPage(WebDriver driver) {
        super();
    }

    @Test
    public void checkDressPage(){
    DressPage dressPage = PageFactory.initElements(setDriver(driver), DressPage.class);
    dressPage.openUrl("http://automationpractice.com/index.php");

    HashMap<String, Integer> expectedColors = dressPage.getCatalog().getCatalogColors();
    HashMap<String, Integer> actualColors = dressPage.getPageColors();

    boolean result = expectedColors.equals(actualColors);
    Assert.assertTrue(result);
    }
}
