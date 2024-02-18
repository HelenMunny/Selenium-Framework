import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest extends BaseClass{
    DropdownClass dropdownClass;

    @BeforeMethod
    public void setup(){
        invokeBrowser("https://ebay.com");
        dropdownClass = PageFactory.initElements(BaseClass.driver,DropdownClass.class);
    }
    @AfterMethod
    public void quit(){
        quitBrowser();
    }

    @Test
    public void dropdownT(){
        String expected = "https://www.ebay.com/b/Baby-Essentials/2984/bn_1854104";
        String actual = dropdownClass.dropdownF();
        Assert.assertEquals(actual,expected);
}
}
