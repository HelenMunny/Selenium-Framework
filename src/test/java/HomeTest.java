import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends BaseClass{
    HomePage home;



    @BeforeMethod
    void setup(){
        invokeBrowser("https://www.ebay.com/");
        home = PageFactory.initElements(BaseClass.driver, HomePage.class);
    }

    @Test
    void testClick(){
        String expectedURL = "https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334";
        String actualURL = home.clickMotors();
        Assert.assertEquals(actualURL,expectedURL);
    }



}
