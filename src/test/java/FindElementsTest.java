import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindElementsTest extends BaseClass{
    FindElements findElements;
    @BeforeMethod
    public void setup(){
        invokeBrowser("https://ebay.com");
        findElements = PageFactory.initElements(BaseClass.driver,FindElements.class);
    }
    @AfterMethod
    public void quit(){
        quitBrowser();
    }

    @Test
    public void listsT(){
        int actual = findElements.listsF();
        int expected = 46;
        Assert.assertEquals(actual,expected);
    }


}
