package parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowser {


    WebDriver driver = null;
    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpred\\Desktop\\sourses\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://mclasshome.aws.wgen.net/reports/Correlation");
        driver.findElement(By.id("login-username")).clear();
        driver.findElement(By.id("login-username")).sendKeys("muser47");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Abcd1234");
        driver.findElement(By.id("login-submit")).click();





    }

}
