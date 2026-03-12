package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.util.List;

public class CheckboxesPage {
    private final WebDriver driver;

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }
    public List<WebElement> getCheckboxes(){
        return driver.findElements(By.cssSelector("[type=checkbox]"));
    }
    public void open() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }
    public boolean isChecked(int index)
    {
        return getCheckboxes().get(index).isSelected();
    }
    public void clickCheckbox(int index) {
        getCheckboxes().get(index).click();
    }
}
