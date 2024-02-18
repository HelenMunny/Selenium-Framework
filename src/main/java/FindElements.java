import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class FindElements extends BaseClass{
    @FindAll({
            @FindBy(xpath = "//li[@class=\"gf-li\"]")
    })
    public List<WebElement> lists;

    public Integer listsF(){
        for(WebElement item:lists){
            System.out.println(item.getText());
        }
        for(WebElement check:lists){
            check.isEnabled();
        }
        return lists.size();
    }
}
