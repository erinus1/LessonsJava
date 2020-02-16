package main.Pattern_10Module;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DressPage extends BasePage {
    WebDriver driver;

    public DressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement dressButton;

    @FindBys(@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_3\"]"))
    private List<WebElement> listOfColors;

    @FindBys(@FindBy(xpath = "//*[@class='color_pick'][contains(@href, 'color-')]"))
    private List<WebElement> dressOfColors;

    public void openUrl(String url) {
        driver.get(String.valueOf(url));
        setWait();
        String dressURL = driver.getCurrentUrl();
//        Assert.assertTrue(dressURL.contains("id_category=8&controller=category"));
    }

    public void checkColors() {
        dressButton.click();
        setWait();

        //remove () from collection
        HashMap<String, Integer> menuMap = new HashMap<>();
        for (WebElement panel : listOfColors) {
            String colors = panel.getText();
            String color = colors.replaceAll("(\\w+\\s?)\\((\\s?\\d+\\s?)\\)", "$1= $2 ").trim();
            menuMap.put(color, 1);
            System.out.println(menuMap);
        }

        //split href color to list
        HashMap<String, Integer> dressMap = new HashMap<>();
        for (WebElement itemsDress : dressOfColors) {
            String urlCol = itemsDress.getAttribute("href");
            String hrefRes = urlCol.substring(urlCol.lastIndexOf("-") + 1);
            if (dressMap.containsKey(hrefRes)) {
                dressMap.put(hrefRes, dressMap.get(hrefRes) + 1);
            } else {
                dressMap.put(hrefRes, 1);
            }
        }
        System.out.println(dressMap);

        System.out.println(menuMap.equals(dressMap));
    }
}





