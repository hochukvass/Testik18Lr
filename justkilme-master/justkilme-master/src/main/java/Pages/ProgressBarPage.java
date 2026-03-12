package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class InputsPage {
    private final WebDriver driver;
    By ifield = By.tagName("input");

    public InputsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() {
        driver.get("https://the-internet.herokuapp.com/inputs");
    }
    public void enterText(String text)
    {
        driver.findElement(ifield).clear();
        driver.findElement(ifield).sendKeys(text);
    }
    public String getInput() {
        return driver.findElement(ifield).getAttribute("value");
    }
    public void pressUpArrow(){ driver.findElement(ifield).sendKeys(Keys.ARROW_UP); }
    public void pressDownArrow(){ driver.findElement(ifield).sendKeys(Keys.ARROW_DOWN); }
}
