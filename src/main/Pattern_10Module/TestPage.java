package main.Pattern_10Module;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import java.util.HashMap;

public class TestPage extends BasePage {

    @Test
    public void checkDressPage(){
    DressPage dressPage = PageFactory.initElements(driver, DressPage.class);
    dressPage.openUrl("http://automationpractice.com/index.php");
    HashMap<String, Integer> expectedColors = dressPage.();
    HashMap<String, Integer> actualColors = dressPage.getPageColors();
    boolean result = expectedColors.equals(actualColors);
    Assert.assertTrue(result);
    }
}


