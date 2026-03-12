import Pages.TyposPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

public class TyposTest extends BaseTest {
    @Test
    public void TyposTests(){
        TyposPage typ = new TyposPage(driver);
        typ.open();

    }

}