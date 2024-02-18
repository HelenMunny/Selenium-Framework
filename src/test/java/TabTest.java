import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TabTest extends BaseClass{
    TabClass tabClass;

    @BeforeMethod
    public void setup(){
        invokeBrowser("https://demoqa.com/browser-windows");
        tabClass = PageFactory.initElements(BaseClass.driver, TabClass.class);
    }
    @AfterMethod
    public void quit(){
        quitBrowser();
    }
    @Test
    public void tabT() {
        String actual = tabClass.tabF();
        String expected = "This is a sample page";
        Assert.assertEquals(actual,expected);

    }
}
