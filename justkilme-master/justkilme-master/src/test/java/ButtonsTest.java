import Pages.TextBoxPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class AddRemoveTest extends BaseTest {
    @Test
    public void arpTests(){
        TextBoxPage arp = new TextBoxPage(driver);
        arp.open();
        arp.addElement();
        arp.addElement();
        arp.deleteElement();
        Assert.assertEquals(arp.getDeleteButtonsCount(), 1, "=1");
    }
}
