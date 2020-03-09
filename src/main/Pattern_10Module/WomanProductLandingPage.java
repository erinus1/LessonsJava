package main.Pattern_10Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomanProductLandingPage extends ProductLandingPage {

    @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    private WebElement womanButton;

    public WomanProductLandingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement getPlpButton() {
        return womanButton;
    }
}
