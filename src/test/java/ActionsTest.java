import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTest extends BaseClass{
    ActionsClass actionsClass;

    @BeforeMethod
    public void setup(){
        invokeBrowser("https://ebay.com");
       actionsClass = PageFactory.initElements(BaseClass.driver,ActionsClass.class);
    }

@Test
public void actionsT(){

    String actual = actionsClass.actionsF();
    String expected = "https://www.ebay.com/b/Video-Games/139973/bn_320034";
        Assert.assertEquals(actual,expected);
}
}
