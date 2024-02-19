import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertClass extends BaseClass{
@FindBy(xpath = "//input[@name=\"alert\"]")
    WebElement alertBtn;



public boolean alertF(){
    alertBtn.click();
    alertAccept();
    return alertBtn.isEnabled();
}
}
