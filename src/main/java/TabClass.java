import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class TabClass extends BaseClass{
    @FindBy(xpath = "//button[@id=\"tabButton\"]")
    WebElement tabBtn;
    @FindBy(xpath = "//h1[@id=\"sampleHeading\"]")
    WebElement heading;


    public String tabF() {
        tabBtn.click();
        switchTab();
        System.out.println(heading.getText());
        return heading.getText();
    }
}
