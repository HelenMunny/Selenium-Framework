import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowClass extends BaseClass{
    @FindBy(xpath = "//button[@id=\"windowButton\"]")
    WebElement windowBtn;
    @FindBy(id = "sampleHeading")
    WebElement heading;
    public String window() throws InterruptedException {
       Thread.sleep(2000);
        windowBtn.click();
        Thread.sleep(2000);
        switchWin();
        return heading.getText();
    }

}
