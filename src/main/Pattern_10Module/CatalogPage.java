package main.Pattern_10Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class CatalogPage extends BasePage{
    WebDriver driver;

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBys(@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_3\"]/*[@class='nomargin hiddable col-lg-6']"))
    private List<WebElement> panelColors;

    public HashMap<String, Integer> getCatalogColors() {
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

}
