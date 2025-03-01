package automation.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HelperClass {
    public static HelperClass helperClass =null;
    private static WebDriver driver;
    public static final int TIMEOUT =5;

    private HelperClass(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximize");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    }

    public static void openPage(String url){
        driver.get(url);
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void setUpDriver(){
        if(helperClass==null){
            helperClass = new HelperClass();
        }
    }

    public static void tearDown(){
        if(driver!= null) {
            driver.close();
        }
        helperClass =null;
    }

}
