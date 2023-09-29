package Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public static void afterCucumber(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) GWD.getDriver());
            byte[] tmpImg = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(tmpImg, "image/png", scenario.getName());
        }

        GWD.quit();
    }
}
