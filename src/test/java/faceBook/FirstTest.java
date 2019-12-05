package faceBook;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Sofiia_Bondarenko/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://hotline.ua/login/");

        WebElement emailElement = driver.findElement(By.cssSelector("d[class='form-item'] input, [name=login]"));
        emailElement.sendKeys("qasof991@gmail.com");

        WebElement passElement = driver.findElement(By.cssSelector("d[class='form-item'] input, [name='password']"));
        passElement.sendKeys("Qwerty!!1");

        WebElement button = driver.findElement(By.cssSelector("div:nth-child(3) > input, [data-id='verification']"));
        button.click();

        Thread.sleep(5000);
        boolean textFound = false;
        try {
            driver.findElement(By.cssSelector("div.item-login > span.name.ellipsis"));
            textFound = true;
            System.out.println("You are login");
        } catch (Exception e) {
            textFound = false;
        }

        driver.close();
    }

}
