package main.Pattern_10Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;
import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;


public class DressPage extends BasePage {
    WebDriver driver;

    public DressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement dressButton;

    @FindBys(@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_3\"]/*[@class='nomargin hiddable col-lg-6']"))
    private List<WebElement> listOfColors;

    @FindBys(@FindBy(xpath = "//*[@class='color_pick'][contains(@href, 'color-')]"))
    private List<WebElement> dressOfColors;

    HashMap<String, Integer> menuMap = new HashMap<>();
    HashMap<String, Integer> dressMap = new HashMap<>();

    public String openUrl(String url) {
        driver.get(String.valueOf(url));
        setWait();
        String dressURL = driver.getCurrentUrl();
//      Assert.assertTrue(dressURL.contains("id_category=8&controller=category"));
        return url;
    }

    public void checkColors() {
        dressButton.click();
        setWait();

        //remove () from collection
        for (WebElement panel : listOfColors) {
            String colors = panel.getText();

            String[] colorAndCount = colors.replaceAll("(\\w+\\s?)\\((\\s?\\d+\\s?)\\)", "$1-$2").trim().split("-");
            String color = colorAndCount[0].trim().toLowerCase();
            Integer count = Integer.parseInt(colorAndCount[1].trim().toLowerCase());

            if (menuMap.containsKey(color)) {
                menuMap.put(color, menuMap.get(color) + count);
            } else {
                menuMap.put(color, count);
            }
        }

        //split href color to list
        for (WebElement itemsDress : dressOfColors) {
            String urlCol = itemsDress.getAttribute("href");
            String hrefRes = urlCol.substring(urlCol.lastIndexOf("-") + 1);
            if (dressMap.containsKey(hrefRes)) {
                dressMap.put(hrefRes, dressMap.get(hrefRes) + 1);
            } else {
                dressMap.put(hrefRes, 1);
            }
        }
    }

    public boolean checkEquals() {
        for (Map.Entry<String, Integer> me : menuMap.entrySet()) {
            if (dressMap.containsKey(me.getKey()))
                System.out.println("-> " + me.getKey());
        }
        for (Map.Entry<String, Integer> me1 : dressMap.entrySet()) {
            if (menuMap.containsKey(me1.getValue()))
                System.out.println(">>-> " + me1.getValue());

        }
        return false;
    }

}





