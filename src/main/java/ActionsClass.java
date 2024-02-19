import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ActionsClass extends BaseClass{
    @FindBy(xpath = "//div[@id=\"vl-flyout-nav\"]/ul/li[4]/a")
    WebElement electronics;
    @FindBy(xpath = "//a[@_sp=\"p4375194.m1380.l3260\"]")
    WebElement videogames;


    public String actionsF() {
        actions(electronics);
        videogames.click();
        return driver.getCurrentUrl();


    }
}
