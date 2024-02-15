import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass{
    @FindBy(xpath = "//input[@id=\"gh-ac\"]")
    WebElement searchBox;
    @FindBy(xpath = "//input[@id=\"gh-btn\"]")
    WebElement searchBtn;

    public String typeSearch(String type){
        searchBox.sendKeys(type);
        return driver.getCurrentUrl();
    }
public String clickSearchBtn(String type){
        searchBox.sendKeys(type);
        searchBtn.click();
        return driver.getCurrentUrl();
}

}
