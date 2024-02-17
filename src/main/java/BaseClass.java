import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
}
