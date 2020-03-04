package main.Pattern_10Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class Catalog {
    WebDriver driver;

    public Catalog(WebDriver driver) {
        this.driver = driver;
    }

    //@FindBys(@FindBy(xpath = ".//*[@class='color-option  ']"))
    private List<WebElement> panelColors = driver.findElements(By.xpath(".//*[@class='color-option  ']"));

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
