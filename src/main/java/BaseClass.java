import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class BaseClass {
   public static WebDriver driver;

   public void invokeBrowser(String url){
       System.setProperty("webdriver.jdk.factory","jdk-http-client");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get(url);
   }

   public void quitBrowser(){
       driver.quit();
   }

    public void switchTab(){
        String currTab = driver.getWindowHandle();
        Set<String> allTabs = driver.getWindowHandles();
        for(String tab:allTabs){
            if (currTab != tab){
                driver.switchTo().window(tab);
            }
        }
    }

    public void switchWin(){
        String currWin = driver.getWindowHandle();
        Set<String> allWins = driver.getWindowHandles();
        for(String a:allWins){
            if (currWin != a){
                driver.switchTo().window(a);
            }
        }
    }

    public void dropdown(WebElement element,String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void actions(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void alertAccept(){
        driver.switchTo().alert().accept();
    }

}
