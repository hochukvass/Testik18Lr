import Pages.DropdownPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class DropdownTest extends BaseTest {
    @Test
    public void DropdownTestOptionOne(){
        DropdownPage dpd = new DropdownPage(driver);
        dpd.open();

        dpd.selectByText("Option 1");
        Assert.assertEquals(dpd.getFirstSelectedOption(), "Option 1", "should be like that ig idk");
    }
    @Test
    public void DropdownTestOptionTwo(){
        DropdownPage dpd = new DropdownPage(driver);
        dpd.open();

        dpd.selectByText("Option 2");
        Assert.assertEquals(dpd.getFirstSelectedOption(), "Option 2", "should be like that ig idk");
    }
}