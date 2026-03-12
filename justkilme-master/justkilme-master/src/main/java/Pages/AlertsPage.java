package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class DropdownPage {
    private final WebDriver driver;
    By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }
    public void selectByText(String text)
    {
        Select select = new Select(driver.findElement(dropdown));
        select.selectByVisibleText(text);
    }
    public String getFirstSelectedOption() {
        Select select = new Select(driver.findElement(dropdown));
        return select.getFirstSelectedOption().getText();
    }
}
