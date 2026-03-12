package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class TyposPage {
    private final WebDriver driver;
    By paragraph2 = By.tagName("p");

    public TyposPage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() {
        driver.get("https://the-internet.herokuapp.com/typos");
    }
    public String getParagraphText(){ return driver.findElement(paragraph2).getText(); }
}
