import Pages.CheckboxesPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class CheckboxTest extends BaseTest {

    @Test
    public void checkboxTestFirstBoxNegative(){
        CheckboxesPage cbT = new CheckboxesPage(driver);
        cbT.open();

        Assert.assertEquals(cbT.isChecked(0), false, "shoudl e faes 1");
    }
    @Test
    public void checkboxTestFirstBoxPositive() {
        CheckboxesPage cbT = new CheckboxesPage(driver);
        cbT.open();

        cbT.clickCheckbox(0);
        Assert.assertEquals(cbT.isChecked(0), true, "shoudl e true 1");
    }
    @Test
    public void checkboxTestSecondBoxNegative() {
        CheckboxesPage cbT = new CheckboxesPage(driver);
        cbT.open();

        cbT.clickCheckbox(1);
        Assert.assertEquals(cbT.isChecked(1), false, "shoudl e faes 2");
    }
    @Test
    public void checkboxTestSecondBoxPositive() {
        CheckboxesPage cbT = new CheckboxesPage(driver);
        cbT.open();

        Assert.assertEquals(cbT.isChecked(1), true, "shoudl etruew 2 ");
    }
}
