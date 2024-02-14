import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass{
    @FindBy(xpath = "//a[@_sp=\"p4375194.m1379.l3250\"][position()=1]")
    WebElement motors;
    String clickMotors(){
        motors.click();
        return driver.getCurrentUrl();

    }

}
