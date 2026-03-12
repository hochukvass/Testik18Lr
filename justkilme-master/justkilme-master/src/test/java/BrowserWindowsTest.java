import Pages.InputsPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class InputsTest extends BaseTest {
    @Test
    public void testInputs(){
        InputsPage page = new InputsPage(driver);
        page.open();

        page.enterText("123322");
        Assert.assertEquals(page.getInput(), "123322", "в идеале будет 123322");

        page.pressDownArrow();
        Assert.assertEquals(page.getInput(), "123321", "в идеале будет 123321");

        page.pressUpArrow();
        Assert.assertEquals(page.getInput(), "123322", "в идеале будет 123322");

        page.enterText("bebebe");
        Assert.assertEquals(page.getInput(), "", "в идеале будет ничего");
    }
}
