import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class WindowClass extends BaseClass{
    @FindBy(xpath = "//button[@id=\"tabButton\"]")
    WebElement windowBtn;
    @FindBy(xpath = "//h1[@id=\"sampleHeading\"]")
    WebElement heading;


    public String windowF() {
        windowBtn.click();
        String currWin = driver.getWindowHandle();
        Set<String> allWins = driver.getWindowHandles();
        for(String win:allWins){
            if (currWin != win){
                driver.switchTo().window(win);
            }
        }
        System.out.println(heading.getText());
        return heading.getText();
    }
}
