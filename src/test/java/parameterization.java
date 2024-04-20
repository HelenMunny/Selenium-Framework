import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class parameterization extends BaseClass{


    @Test
    @Parameters({"URL"})
    public void invoke(String url){
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }


    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[3][2];
        data[0][0] = "Munny";
        data[0][1] = "1234";

        data[1][0] = "Mahmuda";
        data[1][1] = "123";

        data[2][0] = "Munny";
        data[2][1] = "14";
        return data;
    }

    @Test(dataProvider = "getData")
    public void client(String username, String password){
        System.out.println(username);
        System.out.println(password);
    }
}
