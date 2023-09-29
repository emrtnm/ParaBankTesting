package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {
    public static WebDriver driver;

    public static WebDriverWait wait;

    public static WebDriver getDriver() {
        if (driver == null) {
            Logger logger = Logger.getLogger("");
            logger.setLevel(Level.SEVERE);

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        }

        return driver;
    }

    public static WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        }

        return wait;
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
            wait = null;
        }
    }
}
