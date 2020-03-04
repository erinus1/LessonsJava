package main.Pattern_10Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import java.util.*;

public class DressPage extends BasePage {
    WebDriver driver;

    public DressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement dressButton;

    @FindBys(@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_3\"]/*[@class='nomargin hiddable col-lg-6']"))
    private List<CatalogPage> listOfColors;

    @FindBys(@FindBy(xpath = "//*[@class='color_pick'][contains(@href, 'color-')]"))
    private List<WebElement> dressOfColors;

    public String openUrl(String url) {
        driver.get(String.valueOf(url));
        dressButton.click();
        setWait();
        String dressURL = driver.getCurrentUrl();
        return dressURL;
    }

    public HashMap<String, Integer> getPageColors() {
        HashMap<String, Integer> actualColors = new HashMap<>();
        //split href color to list
        for (WebElement itemsDress : dressOfColors) {
            String urlCol = itemsDress.getAttribute("href");
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





