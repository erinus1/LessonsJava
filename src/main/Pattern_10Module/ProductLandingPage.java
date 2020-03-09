package main.Pattern_10Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import java.util.HashMap;
import java.util.List;

abstract class ProductLandingPage extends BasePage {

    @FindBys(@FindBy(xpath = ".//*[contains(@class, 'layered_color')]/a"))
    private List<WebElement> panelColors;
    @FindBys(@FindBy(xpath = "//*[@class='color_pick'][contains(@href, 'color-')]"))
    private List<WebElement> swatchColors;

    public ProductLandingPage(WebDriver driver) {
        super(driver);
    }

    abstract protected WebElement getPlpButton ();

    public String openPLP() {
        getPlpButton().click();
        setWait();
        return driver.getCurrentUrl();
    }

    public HashMap<String, Integer> getColorsFromLayerNavMenu() {
        HashMap<String, Integer> expectedColors = new HashMap<>();

        for (WebElement panel : panelColors) {
            String colors = panel.getText();
            String[] colorAndCount = colors.replaceAll("(\\w+\\s?)\\((\\s?\\d+\\s?)\\)", "$1-$2").trim().split("-");
            String color = colorAndCount[0].trim().toLowerCase();
            Integer count = Integer.parseInt(colorAndCount[1].trim().toLowerCase());

            if (expectedColors.containsKey(color)) {
                expectedColors.put(color, expectedColors.get(color) + count);
            } else {
                expectedColors.put(color, count);
            }
        }
        return expectedColors;
    }

    public HashMap<String, Integer> getPageColors() {
        HashMap<String, Integer> actualColors = new HashMap<>();
        for (WebElement swatchColor : swatchColors) {
            String urlCol = swatchColor.getAttribute("href");
            String hrefRes = urlCol.substring(urlCol.lastIndexOf("-") + 1);
            if (actualColors.containsKey(hrefRes)) {
                actualColors.put(hrefRes, actualColors.get(hrefRes) + 1);
            } else {
                actualColors.put(hrefRes, 1);
            }
        }
        return actualColors;
    }
}