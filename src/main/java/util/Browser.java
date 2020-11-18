package util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;

    public static void open(String browserType) {
        switch (browserType) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "D:\\webdrivers\\edgedriver_win64\\msedge.driver.exe");
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;

            default:
                throw new RuntimeException("The browser that is chosen " + browserType + " is not a valid browser!");
        }
    }

    public static void quit() {
        driver.quit();
    }
}


