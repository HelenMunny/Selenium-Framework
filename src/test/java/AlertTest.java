import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest extends BaseClass{
    AlertClass alertClass;

    @BeforeMethod
    public void setup(){
        invokeBrowser("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver\n");
        alertClass = PageFactory.initElements(BaseClass.driver,AlertClass.class);
    }

    @AfterMethod
    public void quit(){
        quitBrowser();
    }

    @Test
    public void alertT(){
        boolean actual = alertClass.alertF();
        boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

}
