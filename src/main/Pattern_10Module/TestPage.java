package main.Pattern_10Module;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TestPage extends BasePage {

    @Test
    public void checkDressPage(){
    DressPage dressPage = PageFactory.initElements(driver, DressPage.class);
    dressPage.openUrl("http://automationpractice.com/index.php");
    dressPage.getExpectedColors();
    dressPage.getPageColors();
    //dressPage.checkEquals();

    }
}


