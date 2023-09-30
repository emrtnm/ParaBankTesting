package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Parent {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
    SoftAssert _softAssert = new SoftAssert();

    public void ButtonClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        js.executeScript("arguments[0].click();", element);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void sendText(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.click();
        JS(element);
        element.sendKeys(text);
    }

    public static void JS(WebElement e){

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",e);

    }

    public void VerifyMessage(WebElement element){
        boolean varMi=false;
        wait.until(ExpectedConditions.visibilityOf(element));
        if(element.getText().toLowerCase().contains("success")){
            varMi=true;
            _softAssert.assertTrue(varMi);
            _softAssert.assertAll();

        }

    }

    public  void SelectItem(WebElement e , String index){
        Select select = new Select(e);
        select.selectByValue(index);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    public  int randomGenerator(int sinir){
        return (int)(Math.random()*sinir);
    }









}
