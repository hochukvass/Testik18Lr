package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.util.List;

public class AddRemovePage{
    private WebDriver driver;

    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
    }
    public void addElement(){
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
    }
    public void open() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }
    public void deleteElement()
    {
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
    }
    public int getDeleteButtonsCount() {
        List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='Delete']"));
        return buttons.size();
    }
}
