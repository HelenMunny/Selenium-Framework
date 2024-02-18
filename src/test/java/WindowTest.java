import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowTest extends BaseClass{
    WindowClass windowClass;
    @BeforeMethod
    public void setup(){
        invokeBrowser("https://demoqa.com/browser-windows");
        windowClass = PageFactory.initElements(BaseClass.driver, WindowClass.class);
    }
    @AfterMethod
    public void quit(){
        quitBrowser();
    }

    @Test
    public void windowT(){
        String actual = windowClass.windowF();
        String expected = "This is a sample page";
        Assert.assertEquals(actual,expected);
    }
}
