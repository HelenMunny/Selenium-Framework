import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownClass extends BaseClass{
    @FindBy(xpath = "//select[@id=\"gh-cat\"]")
    WebElement categories;
    @FindBy(xpath = "//input[@id=\"gh-btn\"]")
    WebElement searchBtn;



    public String dropdownF(){
        dropdown(categories,"Books");
        searchBtn.click();
        return driver.getCurrentUrl();
    }
}
