package main.Pattern_10Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressProductLandingPage extends ProductLandingPage {
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    protected WebElement dressButton;

    public DressProductLandingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement getPlpButton() {
        return dressButton;
    }
}
