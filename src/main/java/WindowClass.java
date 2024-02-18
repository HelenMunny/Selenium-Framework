import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowClass extends BaseClass{
    @FindBy(id = "windowButton")
    WebElement windowBtn;
    @FindBy(id = "sampleHeading")
    WebElement heading;

    public String windowF(){
        windowBtn.click();
        switchWin();
        return heading.getText();
    }
}
