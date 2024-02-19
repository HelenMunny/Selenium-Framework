import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomeTest extends BaseClass{
    HomePage home;

    @BeforeMethod
    public void setup(){
        invokeBrowser("https://ebay.com");
        home = PageFactory.initElements(BaseClass.driver,HomePage.class);
    }
    @AfterMethod
    public void quit(){
        quitBrowser();
    }

    @Test
    public void searchTest(){
        String expected = "https://www.ebay.com/";
        String actual = home.typeSearch("Moisturizer");
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void searchBtnTest(){
        String expected = "https://www.ebay.com/sch/i.html?_from=R40&_trksid=p4432023.m570.l1313&_nkw=Moisturizer&_sacat=0";
        String actual = home.clickSearchBtn("Moisturizer");
        Assert.assertEquals(actual,expected);
    }




}
